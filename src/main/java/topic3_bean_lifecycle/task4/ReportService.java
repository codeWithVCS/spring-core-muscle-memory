package topic3_bean_lifecycle.task4;

public class ReportService {
    public final ResourceManager resourceManager;
    public final ReportRepository reportRepository;
    public ReportService(ResourceManager resourceManager, ReportRepository reportRepository) {
        this.resourceManager = resourceManager;
        this.reportRepository = reportRepository;
    }
    public void generate(String jobId){
        System.out.println("ReportService: generating report " + jobId);
        resourceManager.allocate(jobId);
        reportRepository.save(jobId);
        resourceManager.free(jobId);
        System.out.println("ReportService: report " + jobId + " completed.");
    }
}
