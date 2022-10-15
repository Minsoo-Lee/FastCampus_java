package ch08;

import ch07.GenericPrinter;
import ch07.Powder;

public class GenericPrinterTest {
    public static void main(String[] args) {
        ch07.Powder powder = new ch07.Powder();
        ch07.GenericPrinter<ch07.Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());

        p.
    }
}
