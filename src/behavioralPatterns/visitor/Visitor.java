package behavioralPatterns.visitor;

public interface Visitor {

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);

    void visit(Printer printer);

    void visit(Computer computer);
}
