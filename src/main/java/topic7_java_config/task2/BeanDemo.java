package topic7_java_config.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        DatabaseRepository databaseRepository = context.getBean(DatabaseRepository.class);
        databaseRepository.query();
        context.close();
    }
}
