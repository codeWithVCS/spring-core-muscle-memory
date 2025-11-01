package topic2_ioc_di.task4.controller;

import org.springframework.stereotype.Controller;
import topic2_ioc_di.task4.service.OrderService;

@Controller
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    public void create(String orderId, double amount) {
        System.out.println("OrderController: request to create order " + orderId);
        orderService.placeOrder(orderId, amount);
        System.out.println("OrderController: response for order " + orderId + " sent");
    }
}
