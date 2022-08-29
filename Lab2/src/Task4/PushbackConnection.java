package Task4;

public class PushbackConnection implements Connection {
    private String stack;

    public PushbackConnection(String stack) {
        this.stack = stack;
    }

    @Override
    public void pushBack(String val) {
        this.stack = val;
    }

    public String getStack() {
        return stack;
    }

    @Override
    public void connect() {
        System.out.println("Connected...");
    }

    @Override
    public void disConnect() {
        System.out.println("Disconnected...");
    }

    @Override
    public String receive() {
        return stack;
    }

    @Override
    public void send(String arg) {
        stack = arg;
    }

}