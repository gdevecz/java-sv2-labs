package compositionlist;

import java.util.Scanner;

public class BooksMain {

    public static void main(String[] args) {
        Books books = new Books();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány könyvet szeretnél megadni? ");
        int numberOfBooks = sc.nextInt();
        String author;
        String title;

        sc.nextLine();
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.print("Kérem az " + (i +1) + ". könyv címét: ");
            books.addBook(sc.nextLine());
        }
        System.out.println("A könyvek listája: ");
        for (String book : books.getBooks()) {
            System.out.println(book);
        }

        System.out.print("Kérem a keresett könyv címét: ");
        title = sc.nextLine();
        System.out.print("Kérem a keresett könyv szerzőjét:");
        author = sc.nextLine();
        books.findBookAndSetAuthor(title,author);
        System.out.println("A könyvek listája: ");
        for (String book : books.getBooks()) {
            System.out.println(book);
        }
        books.addBook("Egri csillagok");
        System.out.println(books.getBooks().get(0));
        books.findBookAndSetAuthor("Egri csillagok", "Gádonyi Géza");
        System.out.println(books.getBooks().get(0));
        System.out.println("A könyvek listája: ");
        for (String book : books.getBooks()) {
            System.out.println(book);
        }

    }
}
