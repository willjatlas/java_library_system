import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower barryB;
    Library library;
    Book book1;

    @Before
    public void before() {
        barryB  = new Borrower("Barry Bookman", "Chaos");
        book1   = new Book("Chaos", "James Gleick", "Science Non-Fiction");
        library = new Library();
        library.addBook(book1);
    }

    @Test
    public void canBorrowBook() {
        barryB.borrowBook(library);
        assertEquals(1, barryB.getBorrowCount());
    }

}