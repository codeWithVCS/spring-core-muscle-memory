package topic5_component_scanning.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import topic5_component_scanning.task4.controller.OrderController;

public class MultiPackageScanDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderController orderController = context.getBean(OrderController.class);
        orderController.handleRequest("ORD-501");
        context.close();
    }
}
