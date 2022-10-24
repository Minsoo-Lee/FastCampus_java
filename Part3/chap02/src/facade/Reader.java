package facade;

public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("Connect to Reader : %s", fileName);
        System.out.println(msg);
    }

    public void fileRead() {
        String msg = String.format("Read from Reader : %s", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect() {
        String msg = String.format("Disconnect to Reader : %s", fileName);
        System.out.println(msg);
    }
}
