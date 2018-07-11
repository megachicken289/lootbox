package utls;

import org.junit.Before;
import org.junit.Test;
import utils.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {
	
	InputStream stdin;
	
	private String testStringQuestion = "This is a test question";
	
	private String positive = "Y";
	private String negative = "N";
	private String positiveFull = "YES";
	private String negativeFull = "NO";
	private String testStringPass = "TEST";
	private String testStringFail = "";     // nothing yet
	private String testNumber = "444";
	private String testNumberWithDot = "444.44";
	private String testNumberWithExtraSigDig = "444.44444";
	private String testNumberWithDollarSymbol = "$444.44";
	private String testNumberWithDirtySymbols = "#(%444.44)*";
	
	@Before
	public void setUp() throws Exception {
		
		stdin = System.in;
	}
	
	@Test
	public void testGetPlayerChoiceAsYNAsPositives() throws Exception {
		
		{
			System.setIn(new ByteArrayInputStream(positive.getBytes()));
			
			boolean result = StringUtils.getPlayerChoiceAsYN(testStringQuestion); // you must use scan in, and compare
			
			// RESTABLISH System.in
			System.setIn(stdin);
			
			// assert
			assertTrue(result);
		}
		{
			System.setIn(new ByteArrayInputStream(positiveFull.getBytes()));
			boolean result = StringUtils.getPlayerChoiceAsYN(testStringQuestion);
			System.setIn(stdin);
			assertTrue(result);
		}
		{
			System.setIn(new ByteArrayInputStream(positive.toLowerCase().getBytes()));
			boolean result = StringUtils.getPlayerChoiceAsYN(testStringQuestion); // you must use scan in, and compare
			System.setIn(stdin);
			assertTrue(result);
		}
		{
			System.setIn(new ByteArrayInputStream(positiveFull.toLowerCase().getBytes()));
			boolean result = StringUtils.getPlayerChoiceAsYN(testStringQuestion);
			System.setIn(stdin);
			assertTrue(result);
		}
	}
	@Test
	public void testGetPlayerChoiceAsYNAsNegatives() throws Exception {
		
		{
			System.setIn(new ByteArrayInputStream(negative.getBytes()));
			boolean result = StringUtils.getPlayerChoiceAsYN(testStringQuestion); // you must use scan in, and compare
			System.setIn(stdin);
			assertFalse(result);
		}
		{
			System.setIn(new ByteArrayInputStream(negativeFull.getBytes()));
			boolean result = StringUtils.getPlayerChoiceAsYN(testStringQuestion);
			System.setIn(stdin);
			assertFalse(result);
		}
		{
			System.setIn(new ByteArrayInputStream(negative.toLowerCase().getBytes()));
			boolean result = StringUtils.getPlayerChoiceAsYN(testStringQuestion); // you must use scan in, and compare
			System.setIn(stdin);
			assertFalse(result);
		}
		{
			System.setIn(new ByteArrayInputStream(negativeFull.toLowerCase().getBytes()));
			boolean result = StringUtils.getPlayerChoiceAsYN(testStringQuestion);
			System.setIn(stdin);
			assertFalse(result);
		}
	}
	
	@Test
	public void testGetPlayerInputAsString() throws Exception {
		{
			System.setIn(new ByteArrayInputStream(testStringPass.getBytes()));
			String results = StringUtils.getPlayerInputAsString(testStringQuestion);
			System.setIn(stdin);
			assertEquals("TEST",results);
		}
		{
			System.setIn(new ByteArrayInputStream(testStringPass.toLowerCase().getBytes()));
			String results = StringUtils.getPlayerInputAsString(testStringQuestion);
			System.setIn(stdin);
			assertEquals("TEST",results);
		}
	}
	
	@Test
	public void testGetPlayerInputAsDouble() throws Exception {
		{
			System.setIn(new ByteArrayInputStream(testNumber.getBytes()));
			double results = StringUtils.getPlayerInputAsDouble(testStringQuestion);
			System.setIn(stdin);
			assertEquals(444,results,0);
		}
		{
			System.setIn(new ByteArrayInputStream(testNumberWithDollarSymbol.getBytes()));
			double results = StringUtils.getPlayerInputAsDouble(testStringQuestion,true);
			System.setIn(stdin);
			assertEquals(444.44,results,0);
		}
		{
			System.setIn(new ByteArrayInputStream(testNumberWithDirtySymbols.getBytes()));
			double results = StringUtils.getPlayerInputAsDouble(testStringQuestion,true);
			System.setIn(stdin);
			assertEquals(444.44,results,0);
		}
		{
			System.setIn(new ByteArrayInputStream(testNumberWithDot.getBytes()));
			double results = StringUtils.getPlayerInputAsDouble(testStringQuestion);
			System.setIn(stdin);
			assertEquals(444.44,results,0);
		}
		{
			System.setIn(new ByteArrayInputStream(testNumberWithExtraSigDig.getBytes()));
			double results = StringUtils.getPlayerInputAsDouble(testStringQuestion);
			System.setIn(stdin);
			assertEquals(444.44444,results,0);
		}
	}
}
