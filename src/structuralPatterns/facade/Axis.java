package structuralPatterns.facade;

public class Axis implements Element {

    private String axis;

    public Axis(String axis) {
        this.axis = axis;
    }

    @Override
    public void add() {
        System.out.printf("%nAdd %s axis", axis);
    }
}
