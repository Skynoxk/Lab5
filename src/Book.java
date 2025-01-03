import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Book {
    String title ;
    String author;
    int pages;
    String publisher;
    int publishedyear;
    public Book(String title, String author, int pages, String publisher, int publishedyear){
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.publisher = publisher;
        this.publishedyear = publishedyear;
    }
    public Book clone (){
        return  new  Book(this.title, this.author, this.pages, this.publisher, this.publishedyear);
    }
}