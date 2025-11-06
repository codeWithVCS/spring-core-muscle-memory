package topic6_autowired.task5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterAutowiredDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportService reportService = context.getBean(ReportService.class);
        reportService.generateReport("RPT-7001");
        context.close();
    }
}
