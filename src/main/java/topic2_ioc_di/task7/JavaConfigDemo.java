package topic2_ioc_di.task7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeController employeeController = context.getBean(EmployeeController.class);
        employeeController.createEmployee("John Doe");
        context.close();
    }
}
