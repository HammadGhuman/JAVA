package Task4;

public class PushbackDisConnectedState extends DisconnectedState implements Connection {
    private String stack;

    public PushbackDisConnectedState(String stack, String connected, String socket) {
        super(connected, socket);
        this.stack = stack;
    }

    @Override
    public void pushBack(String val) {
        this.stack = val;
    }

    public String getStack() {
        return stack;
    }

}
