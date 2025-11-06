package topic6_autowired.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldAutowiredDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.processPayment("TXN-102");
        context.close();
    }
}
