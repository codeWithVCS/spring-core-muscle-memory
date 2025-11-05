package topic5_component_scanning.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonDefaultScopeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CounterComponent c1 = context.getBean(CounterComponent.class);
        CounterComponent c2 = context.getBean(CounterComponent.class);
        c1.increment();
        c1.getCount();
        c2.getCount();
        context.close();
    }
}
