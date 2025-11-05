package topic5_component_scanning.task4.service;

import org.springframework.stereotype.Service;
import topic5_component_scanning.task4.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public String processOrder(String orderId){
        System.out.println("OrderService: processing order "+ orderId);
        return orderRepository.findOrder(orderId);
    }
}
