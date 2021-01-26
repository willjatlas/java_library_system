import java.util.ArrayList;

public class Library {

    // Instance variables.
    private ArrayList<Book> bookList;
    private int maxCapacity;

    // Constructor.
    public Library(){
        bookList    = new ArrayList<>();
        maxCapacity = 4;
    }

    // Returns length of book array list.
    public int getBookCount(){ return bookList.size(); }

    // Checks if there is room to add books.
    public boolean checkAtCapacity(){
        if(getBookCount() == maxCapacity){
            return false;
        }
        return true;
    }

    // Adds a book to the book array list.
    public void addBook(Book book){
        if (checkAtCapacity()) {
            bookList.add(book);
        }
    }




}
