package Task4;

public class Main {
    public static void main(String args[]) {
        PushbackConnectedState pushbackConnectedState = new PushbackConnectedState("disconnect", "socket", "stack");
        pushbackConnectedState.connect();
        pushbackConnectedState.disConnect();
        PushbackDisConnectedState pushbackDisConnectedState = new PushbackDisConnectedState("disconnect", "socket",
                "stack");
        pushbackDisConnectedState.connect();
        pushbackDisConnectedState.disConnect();
        PushbackConnection pushbackConnection = new PushbackConnection("stack");
        pushbackConnection.connect();
        pushbackConnectedState.disConnect();
    }
}