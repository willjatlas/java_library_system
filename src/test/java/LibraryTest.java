import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before(){

        book1   = new Book("Mort", "Terry Pratchett", "Comedy Fiction");
        book2   = new Book("Guards! Guards!", "Terry Pratchett", "Comedy Fiction");
        book3   = new Book("Demon Haunted World", "Carl Sagan", "Science Non-Fiction");
        book4   = new Book("Thief of Time", "Terry Pratchett", "Comedy Fiction");
        book5   = new Book("Chaos", "James Gleick", "Science Non-Fiction");
        library = new Library();


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

    }

    @Test
    public void canAddBook(){
        library.addBook(book4);
        assertEquals(4, library.getBookCount());
    }

    @Test
    public void canNotAddIfOverCap(){
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.getBookCount());
    }

    @Test
    public void canLendBook(){
        Book output = library.lendBook("Mort");
        assertEquals(book1, output);
        assertEquals(2, library.getBookCount());
    }

}
