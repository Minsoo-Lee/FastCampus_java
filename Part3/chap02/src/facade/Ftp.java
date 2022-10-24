package facade;

public class Ftp {

    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect() {
        System.out.println("Connect to FTP Host : " + host + ", Port : " + port);
    }

    public void moveDirectory() {
        System.out.println("Move to Path : " + path);
    }

    public void disconnect() {
        System.out.println("Disconnect to FTP Host : " + host + ", Port : " + port);
    }
}
