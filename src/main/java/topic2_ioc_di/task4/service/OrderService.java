package topic2_ioc_di.task4.service;

import org.springframework.stereotype.Service;
import topic2_ioc_di.task4.PaymentProcessor;
import topic2_ioc_di.task4.repository.OrderRepository;

@Service
public class OrderService {
    private final PaymentProcessor paymentProcessor;
    private final OrderRepository orderRepository;

    public OrderService(PaymentProcessor paymentProcessor, OrderRepository orderRepository) {
        this.paymentProcessor = paymentProcessor;
        this.orderRepository = orderRepository;
    }

    public void placeOrder(String orderId, double amount) {
        System.out.println("OrderService: placing order " + orderId + "for amount " + amount);
        paymentProcessor.process(amount);
        orderRepository.save(orderId);
        System.out.println("OrderService: order " + orderId + " completed ");
    }
}
