package topic8_value_injection.task6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SystemEnvDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SystemEnvProperties props = context.getBean(SystemEnvProperties.class);
        props.printEnvironmentDetails();
        context.close();
    }
}
