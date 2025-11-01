package topic2_ioc_di.task6;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void save(String bookTitle){
        System.out.println("BookRepository: saved book " + bookTitle + " successfully.");
    }
}
