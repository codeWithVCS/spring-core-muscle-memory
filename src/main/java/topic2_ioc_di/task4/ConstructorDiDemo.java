package topic2_ioc_di.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import topic2_ioc_di.task4.controller.OrderController;

public class ConstructorDiDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("topic2_ioc_di.task4");
        context.refresh();
        OrderController orderController = context.getBean(OrderController.class);
        orderController.create("ORD-1001", 999.99);
        context.close();
    }
}
