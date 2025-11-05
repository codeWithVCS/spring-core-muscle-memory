package topic4_scopes.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeScopeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PrototypeBean b1 =  context.getBean(PrototypeBean.class);
        PrototypeBean b2 =  context.getBean(PrototypeBean.class);
        PrototypeBean b3 =  context.getBean(PrototypeBean.class);
        b1.showId();
        b2.showId();
        b3.showId();
        context.close();
    }
}
