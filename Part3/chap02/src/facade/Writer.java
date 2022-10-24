package facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("Connect to Writer : %s", fileName);
        System.out.println(msg);
    }

    public void fileWrite() {
        String msg = String.format("Write from Writer : %s", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect() {
        String msg = String.format("Disconnect to Writer : %s", fileName);
        System.out.println(msg);
    }
}
