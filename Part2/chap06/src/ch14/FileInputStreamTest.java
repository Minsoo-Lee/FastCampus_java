package ch14;

import sun.reflect.annotation.ExceptionProxy;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt");
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
        } catch (IOException e) {
            e.printStackTrace();
            try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
