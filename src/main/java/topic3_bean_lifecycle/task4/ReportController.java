package topic3_bean_lifecycle.task4;


public class ReportController {
    private final ReportService reportService;
    public ReportController(ReportService reportService){
        this.reportService = reportService;
    }
    public void requestReport(String jobId){
        System.out.println("ReportController: request received for " + jobId);
        reportService.generate(jobId);
        System.out.println("ReportController: response sent for " + jobId);
    }
}
