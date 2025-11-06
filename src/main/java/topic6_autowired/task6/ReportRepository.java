package topic6_autowired.task6;

import org.springframework.stereotype.Repository;

@Repository
public class ReportRepository {
    public void save(String reportId){
        System.out.println("ReportRepository: saving report " + reportId);
    }
}
