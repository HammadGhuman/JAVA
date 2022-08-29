package Task4;

public class DisconnectedState implements Event {
    private String connected;
    private String socket;

    public DisconnectedState(String connected, String socket) {
        this.connected = connected;
        this.socket = socket;
    }

    public String getConnected() {
        return connected;
    }

    public void setConnected(String connected) {
        this.connected = connected;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
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
        return connected;
    }

    @Override
    public void send(String arg) {
        connected = arg;
    }
}
