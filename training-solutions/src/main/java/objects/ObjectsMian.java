package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMian {

    public static void main(String[] args) {

        new Book();     // Később már nem elérhető, nincs rá hivatkozás
        System.out.println(new Book()); // A referencia hash kódját, ha minden igaz.
        Book emptyBook;
        //System.out.println(emptyBook); //Se null, se referencia, itt ez le sem fordítható;
        emptyBook = null;
        System.out.println(emptyBook);  // null
        System.out.println(emptyBook == null);  //true
        Book book = new Book();
        System.out.println(book);   // hash kód
        Book anotherBook = new Book();
        System.out.println(book == anotherBook); //false, a referenciák különböznek (más példányok)

        // A haramadik feladat: Tömbök és listák
        Book[] arrayOfBooks = {new Book(), new Book(), new Book()};
        List<Book> books = new ArrayList<>(Arrays.asList(arrayOfBooks));
        List<Book> anotherBooks = new ArrayList<>();
        anotherBooks.add(new Book());
        anotherBooks.add(new Book());
        anotherBooks.add(new Book());

        System.out.println("A tömb elemei:");
        System.out.println(Arrays.toString(arrayOfBooks));
        System.out.println("A books lista elemei:");
        for (Book item : books) {
            System.out.print(item + ", ");
        }
        System.out.println();
        System.out.println("Az anotherBooks lista elemei:");
        for (Book item : anotherBooks) {
            System.out.print(item + ", ");
        }
    }
}
