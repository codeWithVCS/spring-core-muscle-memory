package topic4_scopes.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonDependencyDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FirstService firstService = context.getBean(FirstService.class);
        SecondService secondService = context.getBean(SecondService.class);
        SharedResource sharedResource = context.getBean(SharedResource.class);
        firstService.execute();
        secondService.execute();
        sharedResource.getUsageCount();
        context.close();
    }
}
