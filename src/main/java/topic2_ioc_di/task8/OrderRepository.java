package topic2_ioc_di.task8;

public class OrderRepository {
    public void save(String orderId){
        System.out.println("OrderRepository: saved order " + orderId + " successfully");
    }
}
