package topic6_autowired.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired(required = false)
    private AuditService auditService;

    public void process(String txnId){
        System.out.println("PaymentService: processing " + txnId);
        paymentRepository.save(txnId);
        if(auditService != null){
            auditService.record(txnId);
        }
    }
}
