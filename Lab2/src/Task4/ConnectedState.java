package Task4;

public class ConnectedState implements Event {
    private String disconnect;
    private String socket;

    public ConnectedState(String disconnect, String socket) {
        this.disconnect = disconnect;
        this.socket = socket;
    }

    public String getDisconnect() {
        return disconnect;
    }

    public void setDisconnect(String disconnect) {
        this.disconnect = disconnect;
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
        return disconnect;
    }

    @Override
    public void send(String arg) {
        disconnect = arg;
    }

}
