package topic2_ioc_di.task9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UnifiedConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        AuditService auditService = context.getBean(AuditService.class);
        customerService.registerCustomer("Alice");
        auditService.log("Customer registration completed.");
        context.close();
    }
}
