package topic2_ioc_di.task2.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        WelcomeService welcomeService = context.getBean(WelcomeService.class);
        welcomeService.welcome();
    }
}
