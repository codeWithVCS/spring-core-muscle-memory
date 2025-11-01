package topic2_ioc_di.task6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void requestBookAddition(String bookTitle){
        System.out.println("BookController: received request to add book  " + bookTitle);
        bookService.addBook(bookTitle);
        System.out.println("BookController: response for book " + bookTitle + " sent.");
    }
}
