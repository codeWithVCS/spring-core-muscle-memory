package topic3_bean_lifecycle.task4;

public class ReportRepository {
    public void save(String jobId){
        System.out.println("ReportRepository: saved report " + jobId);
    }
}
