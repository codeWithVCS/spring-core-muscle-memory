package topic6_autowired.task7;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save(String orderId){
        System.out.println("OrderRepository: saved order " + orderId);
    }
}
