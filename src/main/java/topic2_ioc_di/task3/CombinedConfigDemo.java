package topic2_ioc_di.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CombinedConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.scan("topic2_ioc_di.task3");
        context.refresh();
        NotificationService notificationService = context.getBean(NotificationService.class);
        UtilityService utilityService = context.getBean(UtilityService.class);
        ReportService reportService = context.getBean(ReportService.class);
        notificationService.sendNotification();
        utilityService.performUtilityTask();
        reportService.generateReport();
        context.close();
    }
}
