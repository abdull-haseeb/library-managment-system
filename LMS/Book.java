package Main;

public class Book {
    public String title;
    public String author;
    public Boolean available;

public Book(String title, String author){
    this.title = title;
    this.author = author;
    this.available = true;
}
public String getTitle(){
    return title;
}
public String getAuthor(){
    return author;
}
public Boolean isAvailable(){
    return available;
}
public void setAvailable(Boolean available){
    this.available = available;
}
}