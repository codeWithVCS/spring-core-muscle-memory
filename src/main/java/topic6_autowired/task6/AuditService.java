package topic6_autowired.task6;

import org.springframework.stereotype.Service;

@Service
public class AuditService {
    public void record(String reportId){
        System.out.println("AuditService: recording audit for " + reportId);
    }
}
