package College;

public class Book {
    //Accept Book ID, Title, Author, Genre, and Availability Status as input.
    int id;
    String bookTitle;
    String authorName;
    String genre;
    boolean availability;
    //Scanner sc=new Scanner(System.in);
    public Book(int id,String bookTitle,String authorName,String genre,boolean availability){
        this.id=id;
        this.bookTitle=bookTitle;
        this.authorName=authorName;
        this.genre=genre;
        this.availability=availability;
    }
}
