package topic2_ioc_di.task8;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void processOrder(String orderId){
        System.out.println("OrderService: processing order " + orderId);
        orderRepository.save(orderId);
        System.out.println("OrderService: order " + orderId + " processed successfully.");
    }
}
