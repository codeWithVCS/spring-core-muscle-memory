package topic2_ioc_di.task6;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(String bookTitle){
        System.out.println("BookService: processing book " + bookTitle);
        bookRepository.save(bookTitle);
        System.out.println("BookService: book " + bookTitle + " added successfully.");
    }
}
