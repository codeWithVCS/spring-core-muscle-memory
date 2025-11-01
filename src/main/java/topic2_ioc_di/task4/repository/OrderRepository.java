package topic2_ioc_di.task4.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save(String orderId){
        System.out.println("OrderRepository: saved order " + orderId);
    }
}
