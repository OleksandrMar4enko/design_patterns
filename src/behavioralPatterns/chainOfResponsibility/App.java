package behavioralPatterns.chainOfResponsibility;

public class App {

    public static void main(String[] args) {

        MessageHandler messageHandler = new ConsoleMessageHandler();
        FileMessageHandler fileMessageHandler = new FileMessageHandler();
        messageHandler.setNextMessageHandler(fileMessageHandler);
        fileMessageHandler.setNextMessageHandler(new DbMessageHandler());

        messageHandler.print("hello");
    }
}
