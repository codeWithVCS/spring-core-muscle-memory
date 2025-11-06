package topic6_autowired.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalDependencyDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.process("TXN-102");
        context.close();
    }
}
