package ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] lib = new Book[5];

//        for (int i = 0; i < lib.length; i++) {
//            System.out.println(lib[i]);
//        }
        lib[0] = new Book("태백산백1", "조정래");
        lib[1] = new Book("태백산백2", "조정래");
        lib[2] = new Book("태백산백3", "조정래");
        lib[3] = new Book("태백산백4", "조정래");
        lib[4] = new Book("태백산백5", "조정래");

        for (Book book : lib) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
