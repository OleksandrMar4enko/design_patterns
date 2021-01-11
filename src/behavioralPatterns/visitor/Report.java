package behavioralPatterns.visitor;

public class Report implements Visitor {

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor");
    }

    @Override
    public void visit(Printer printer) {
        System.out.println("Printer");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer");
    }
}
