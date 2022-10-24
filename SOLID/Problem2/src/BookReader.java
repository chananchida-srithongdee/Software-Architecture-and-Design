import java.util.List;
public class BookReader extends Book {
    BookReader(String name, List<String> pages){
        super(name, pages);
    }
    
    public void printToScreen() 
    {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
        
    }
    
}