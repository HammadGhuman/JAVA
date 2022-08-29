package Task4;

public interface Event {
    void connect();

    void disConnect();

    String receive();

    void send(String arg);
}
