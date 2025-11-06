package topic6_autowired.task7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalAutowiredDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder("ORD-501");
        context.close();
    }
}
