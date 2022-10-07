package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] lib = new Book[5];
        Book[] copyLib = new Book[5];

        lib[0] = new Book("태백산백1", "조정래");
        lib[1] = new Book("태백산백2", "조정래");
        lib[2] = new Book("태백산백3", "조정래");
        lib[3] = new Book("태백산백4", "조정래");
        lib[4] = new Book("태백산백5", "조정래");

        copyLib[0] = new Book();
        copyLib[1] = new Book();
        copyLib[2] = new Book();
        copyLib[3] = new Book();
        copyLib[4] = new Book();

        // 얕은 복사
        // System.arraycopy(lib, 0, copyLib, 0, 5);

        for (int i = 0; i < lib.length; i++) {
            copyLib[i].setAuthor(lib[i].getAuthor());
            copyLib[i].setTitle(lib[i].getTitle());
        }

        lib[0].setAuthor("박완서");
        lib[0].setTitle("나목");
        System.out.println("==========lib===========");
        for (Book book : lib) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("==========copyLib===========");
        for (Book book : copyLib) {
            System.out.println(book);
            book.showInfo();
        }

    }
}
