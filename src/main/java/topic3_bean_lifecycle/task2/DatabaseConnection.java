package topic3_bean_lifecycle.task2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    public DatabaseConnection() {
        System.out.println("DatabaseConnection: constructor called");
    }
    @PostConstruct
    public void initConnection(){
        System.out.println("DatabaseConnection: connection established");
    }
    @PreDestroy
    public void closeConnection(){
        System.out.println("DatabaseConnection: connection closed");
    }
}
