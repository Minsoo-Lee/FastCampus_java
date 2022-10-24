package singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = socketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
