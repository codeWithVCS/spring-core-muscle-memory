package topic6_autowired.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorAutowiredDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.send("john@example.com");
        context.close();
    }
}
