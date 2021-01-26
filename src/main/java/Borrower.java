import java.util.ArrayList;

public class Borrower {

    // Instance variables.
    private ArrayList<Book> borrowedBookList;
    private String name;
    private String titleWanted;

    // Constructor.
    public Borrower(String name, String titleWanted){
        borrowedBookList = new ArrayList<>();
        this.titleWanted = titleWanted;
        this.name        = name;
    }

    // Return length of borrowed book array list.
    public int getBorrowCount(){ return borrowedBookList.size(); }

    // Removes their title wanted book from the library
    public void borrowBook(Library library){
        Book wanted = library.lendBook(titleWanted);
        if(wanted != null){
            System.out.println(wanted);
            borrowedBookList.add(wanted);
        }
    }

}
