package objects;

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
    }
}
