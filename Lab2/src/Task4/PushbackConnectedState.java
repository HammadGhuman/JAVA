package Task4;

public class PushbackConnectedState extends ConnectedState implements Connection {
    private String stack;

    public PushbackConnectedState(String disconnect, String socket, String stack) {
        super(disconnect, socket);
        this.stack = stack;
    }

    public String getStack() {
        return stack;
    }

    @Override
    public void pushBack(String val) {
        this.stack = val;
    }

}
