package topic3_bean_lifecycle.task2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MessageQueueListener {
    public MessageQueueListener() {
        System.out.println("MessageQueueListener: constructor called");
    }
    @PostConstruct
    public void startListener(){
        System.out.println("MessageQueueListener: listener started");
    }
    @PreDestroy
    public void stopListener(){
        System.out.println("MessageQueueListener: listener stopped");
    }
}
