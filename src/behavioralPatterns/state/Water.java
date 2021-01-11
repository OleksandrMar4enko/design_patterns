package behavioralPatterns.state;

public class Water {

    private State state;

    public Water() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
