package topic6_autowired.task6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredResolutionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportService reportService = context.getBean(ReportService.class);
        reportService.generate("RPT-1001");
        context.close();
    }
}
