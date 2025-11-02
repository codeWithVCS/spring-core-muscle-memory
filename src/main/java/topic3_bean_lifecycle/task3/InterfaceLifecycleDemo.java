package topic3_bean_lifecycle.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;

public class InterfaceLifecycleDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FileProcessor fileProcessor = context.getBean(FileProcessor.class);
        fileProcessor.processFile();
        context.close();
    }
}
