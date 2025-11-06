package topic6_autowired.task4;

import org.springframework.stereotype.Service;

@Service
public class AuditService {
    public void record(String message){
        System.out.println("AuditService: recording message -> " + message);
    }
}
