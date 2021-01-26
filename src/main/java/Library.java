import java.util.ArrayList;

public class Library {

    // Instance variables.
    private ArrayList<Book> libBookList;
    private int maxCapacity;

    // Constructor.
    public Library(){
        libBookList = new ArrayList<>();
        maxCapacity = 4;
    }

    // Returns length of library book array list.
    public int getBookCount(){ return libBookList.size(); }

    // Checks if there is room to add books.
    public boolean checkAtCapacity(){ return getBookCount() < maxCapacity; }

    // Adds a book to the book array list.
    public void addBook(Book book){ if (checkAtCapacity()) libBookList.add(book); }

    // Lends a book to a borrower.
    public Book lendBook(String title) {
        for (Book book : libBookList){
            if (book.getTitle().equals(title)){
                int index = libBookList.indexOf(book);
                return libBookList.remove(index);
            }
        }
        return null;
    }

}
