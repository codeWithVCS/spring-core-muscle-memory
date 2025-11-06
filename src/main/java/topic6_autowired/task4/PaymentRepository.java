package topic6_autowired.task4;

import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {
    public void save(String transactionId){
        System.out.println("PaymentRepository: saving transaction " + transactionId);
    }
}
