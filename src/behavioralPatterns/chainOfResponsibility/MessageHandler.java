package behavioralPatterns.chainOfResponsibility;

public abstract class MessageHandler {

    MessageHandler nextMessageHandler;

    public void setNextMessageHandler(MessageHandler nextMessageHandler) {
        this.nextMessageHandler = nextMessageHandler;
    }

    void print(String message) {
        printMessage(message);
        if (nextMessageHandler != null) {
            nextMessageHandler.print(message);
        }
    }

    protected abstract void printMessage(String message);

}
