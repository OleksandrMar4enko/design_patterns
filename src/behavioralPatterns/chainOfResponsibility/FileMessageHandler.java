package behavioralPatterns.chainOfResponsibility;

public class FileMessageHandler extends MessageHandler {

    @Override
    protected void printMessage(String message) {
        System.out.printf("print to file: %s %n", message);
    }
}
