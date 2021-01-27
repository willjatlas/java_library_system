import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    // Instance variables.
    private ArrayList<Book> libBookList;
    private HashMap<String,Integer> genreHashMap;
    private int maxCapacity;

    // Constructor.
    public Library(){
        libBookList  = new ArrayList<>();
        genreHashMap = new HashMap<>();
        maxCapacity  = 4;
    }

    // Returns length of library book array list.
    public int getBookCount(){ return libBookList.size(); }

    // Returns a value when given key of the genre hashmap.
    public int getGenreHashMapValue(String key){ return genreHashMap.get(key); }

    // Checks if there is room to add books.
    public boolean checkAtCapacity(){ return getBookCount() < maxCapacity; }

    // Adds a book to the book array list.
    public void addBook(Book book){ if (checkAtCapacity()) libBookList.add(book); }

    // Lends a book to a borrower. Returns null if there is no book.
    public Book lendBook(String title) {
        for (Book book : libBookList)
            if (book.getTitle().equals(title)) {
                int index = libBookList.indexOf(book);
                return libBookList.remove(index);
            }
        return null;
    }

    // Sets the genre hash map to key: genre, value: no of books of that genre.
    public void setGenreHashMap(){
        for(Book book : libBookList){
            String bookKey = book.getGenre();
            if(genreHashMap.containsKey(bookKey)){
                genreHashMap.put(bookKey, genreHashMap.get(bookKey) +1);
            }
            else genreHashMap.put(bookKey, 1);
        }
    }

}
