package topic6_autowired.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MultiConstructorAutowiredDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CommunicationService communicationService = context.getBean(CommunicationService.class);
        communicationService.notifyUser("alice@example.com");
        context.close();
    }
}
