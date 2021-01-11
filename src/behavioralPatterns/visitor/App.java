package behavioralPatterns.visitor;

public class App {

    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();

        computerPart.accept(new Report());
    }
}
