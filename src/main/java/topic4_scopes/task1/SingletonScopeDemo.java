package topic4_scopes.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonScopeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CounterService c1  = context.getBean(CounterService.class);
        CounterService c2  = context.getBean(CounterService.class);
        c1.increment();
        c1.getValue();
        c2.getValue();
        context.close();
    }
}
