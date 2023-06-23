package Main;

// import Main.Library;
// import Main.Book;
public class Main {
    public static void main(String[] arg){
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook(book1);
        
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book2);
        
        library.borrowBook(book2);
        library.borrowBook(book1);


        library.returnBook(book2);
    }
}
