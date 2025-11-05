package topic5_component_scanning.task4.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public String findOrder(String orderId){
        System.out.println("OrderRepository: fetching order "+ orderId);
        return "Order-" +orderId;
    }
}
