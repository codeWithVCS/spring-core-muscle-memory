package topic6_autowired.task3;

import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {
    public void savePayment(String transactionId){
        System.out.println("PaymentRepository: saved transaction " + transactionId);
    }
}
