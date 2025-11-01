package topic2_ioc_di.task6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("topic2_ioc_di.task6");
        context.refresh();
        BookController bookController = context.getBean(BookController.class);
        bookController.requestBookAddition("Spring in Action");
        context.close();
    }
}
