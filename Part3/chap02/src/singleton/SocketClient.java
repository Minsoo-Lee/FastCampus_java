package singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    // singleton은 생성자를 private으로 막아줘야 함
    private SocketClient() {

    }

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
