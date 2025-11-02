package topic3_bean_lifecycle.task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(initMethod = "initializeResources", destroyMethod = "releaseResources")
    public ResourceManager resourceManager() {
        return new ResourceManager();
    }
    @Bean
    public ReportRepository reportRepository() {
        return new ReportRepository();
    }
    @Bean
    public ReportService reportService() {
        return new ReportService(resourceManager(), reportRepository());
    }
    @Bean
    public ReportController reportController() {
        return new ReportController(reportService());
    }
}
