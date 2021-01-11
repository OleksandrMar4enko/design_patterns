package behavioralPatterns.visitor;

public interface ComputerPart {

    void accept(Visitor visitor);
}
