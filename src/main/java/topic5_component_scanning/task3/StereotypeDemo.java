package topic5_component_scanning.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserController userController = context.getBean(UserController.class);
        userController.handle("42");
        context.close();
    }
}
