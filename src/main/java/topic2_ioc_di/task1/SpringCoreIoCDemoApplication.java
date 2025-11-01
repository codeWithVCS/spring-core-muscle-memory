package topic2_ioc_di.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreIoCDemoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("topic2_ioc_di.task1");
        context.refresh();
        MessageService messageService = context.getBean(MessageService.class);
        messageService.getMessage();
    }
}
