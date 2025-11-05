package topic4_scopes.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeInjectionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.runTasks();
        context.close();
    }
}
