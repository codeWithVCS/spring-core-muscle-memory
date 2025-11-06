package topic6_autowired.task6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    private ReportRepository repository;
    @Autowired(required = false)
    private AuditService auditService;

    public void generate(String reportId){
        System.out.println("ReportService: generating report " + reportId);
        repository.save(reportId);
        if(auditService != null){
            auditService.record(reportId);
        }
    }
}
