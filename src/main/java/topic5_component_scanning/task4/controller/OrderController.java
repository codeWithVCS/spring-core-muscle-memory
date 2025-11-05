package topic5_component_scanning.task4.controller;

import org.springframework.stereotype.Controller;
import topic5_component_scanning.task4.service.OrderService;

@Controller
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    public void handleRequest(String orderId){
        System.out.println("OrderController: request received for " + orderId);
        String result = orderService.processOrder(orderId);
        System.out.println("OrderController: response sent -> " + result);
    }
}
