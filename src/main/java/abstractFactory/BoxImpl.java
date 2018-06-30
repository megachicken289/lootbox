package abstractFactory;

public interface BoxImpl
{
    void buildBox();
    void showStats();
    void showHiddenStats();
    double boxReward();         // tied to box
    double boxCost();           // tied to box
    double boxMinThreshold();   // tied to box
    double boxMaxThreshold();   // tied to box
    double boxChance();         // tied to box
    double boxLuck();           // TODO: move to player
}
