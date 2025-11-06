package topic6_autowired.task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    private ReportRepository reportRepository;
    @Autowired
    public void  setReportRepository(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }
    public void generateReport(String reportId){
        System.out.println("ReportService: generating report " + reportId);
        reportRepository.save(reportId);
    }
}
