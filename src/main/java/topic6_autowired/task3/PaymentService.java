package topic6_autowired.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    public void processPayment(String transactionId){
        System.out.println("PaymentService: processing payment " + transactionId);
        paymentRepository.savePayment(transactionId);
    }
}
