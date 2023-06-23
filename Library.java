package Main;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books;
    
    public Library(){
        this.books = new ArrayList<>();
    }
    public void  addBook(Book book){
        books.add(book);
    }
    public void borrowBook(Book book){
        if (book.isAvailable()){
            book.setAvailable(false);
            System.out.println("You borrowed the book" + book.getTitle());
        }else {
            System.out.println("Unfortunately, This book is currently not availble here.");
        }
    }
    public void returnBook(Book book){
        book.setAvailable(true);
        System.out.println("You just returned the book name " + book.getTitle());
    }
}
