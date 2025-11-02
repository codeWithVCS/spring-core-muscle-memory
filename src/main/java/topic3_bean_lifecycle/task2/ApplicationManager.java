package topic3_bean_lifecycle.task2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ApplicationManager {
    private final DatabaseConnection databaseConnection;
    private final MessageQueueListener messageQueueListener;
    public ApplicationManager(DatabaseConnection databaseConnection, MessageQueueListener messageQueueListener) {
        this.databaseConnection = databaseConnection;
        this.messageQueueListener = messageQueueListener;
        System.out.println("ApplicationManager: constructor called");
    }
    @PostConstruct
    public void startApp(){
        System.out.println("ApplicationManager: application started");
    }
    @PreDestroy
    public void stopApp(){
        System.out.println("ApplicationManager: application stopped");
    }
}
