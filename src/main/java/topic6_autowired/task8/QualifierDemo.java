package topic6_autowired.task8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifierDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.dispatchMessage("System maintenance scheduled at 9 PM");
        context.close();
    }
}
