package College;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    public Library(){
        books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void viewBook(){
        for (Book book : books){
            System.out.println("Id: "+ book.id);
            System.out.println("Title: "+ book.bookTitle);
            System.out.println("Author: "+ book.authorName);
            System.out.println("genre: "+ book.genre);
            System.out.println("Avaibility: "+ book.availability);
            System.out.println();
        }
    }
    public boolean searchBook(int id){
        for(Book book :books){
            if(book.id==id){
                return true;
            }
        }
        return false;
    }
    public void removeBook(String genre){
        for(Book book:books){
            if(book.genre.equals(genre)){
                books.remove(book);
                break;
            }
        }
    }
}
