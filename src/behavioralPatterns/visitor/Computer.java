package behavioralPatterns.visitor;

public class Computer implements ComputerPart {

    private ComputerPart[] computerParts = new ComputerPart[]{
            new Keyboard(), new Mouse(), new Monitor(), new Printer()
    };

    @Override
    public void accept(Visitor visitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(visitor);
        }

        visitor.visit(this);
    }
}
