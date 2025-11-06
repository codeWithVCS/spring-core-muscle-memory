package topic6_autowired.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private Optional<AuditService> auditService;
    public void placeOrder(String orderId){
        System.out.println("OrderService: placing order " + orderId);
        orderRepository.save(orderId);
        auditService.ifPresent(au -> au.record(orderId));
    }
}
