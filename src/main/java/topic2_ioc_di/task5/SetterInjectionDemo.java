package topic2_ioc_di.task5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterInjectionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("topic2_ioc_di.task5");
        context.refresh();
        NotificationController notificationController = context.getBean(NotificationController.class);
        notificationController.trigger("Welcome via Setter Injection!");
        context.close();
    }
}
