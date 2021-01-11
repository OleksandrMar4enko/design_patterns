package behavioralPatterns.state;

public class LiquidState implements State {

    @Override
    public void changeState(Water water) {
        System.out.println("Water is in the liquid state");
        water.setState(this);
    }

    @Override
    public String toString() {
        return "It can be dew";
    }
}
