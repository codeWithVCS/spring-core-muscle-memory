package topic2_ioc_di.task3;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void sendNotification(){
        System.out.println("NotificationService (Annotation-based): Sending notification...");
    }
}
