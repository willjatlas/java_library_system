public class Book {

    //Instance variables.
    private String title;
    private String author;
    private String genre;

    // Constructor
    public Book(String title, String author, String genre){
        this.title  = title;
        this.author = author;
        this.genre  = genre;
    }

    // Returns books title.
    public String getTitle(){ return this.title; }

    // Returns books genre.
    public String getGenre(){ return this.genre; }

}
