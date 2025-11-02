package topic2_ioc_di.task8;

public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder(String orderId){
        System.out.println("OrderController: received request to create order " + orderId);
        orderService.processOrder(orderId);
        System.out.println("OrderController: response sent for order " + orderId);
    }
}
