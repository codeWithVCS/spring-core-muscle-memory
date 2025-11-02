package topic3_bean_lifecycle.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomBeanLifecycleDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ReportController reportController = context.getBean(ReportController.class);
        reportController.requestReport("JOB-3001");
        context.close();
    }
}
