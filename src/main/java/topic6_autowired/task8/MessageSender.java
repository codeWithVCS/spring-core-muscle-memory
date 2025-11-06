package topic6_autowired.task8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {
    @Autowired
    @Qualifier("emailNotificationService")
    private NotificationService emailNotificationService;
    @Autowired
    @Qualifier("smsNotificationService")
    private NotificationService smsNotificationService;
    public void dispatchMessage(String content){
        System.out.println("MessageSender: dispatching -> " + content);
        emailNotificationService.send(content);
        smsNotificationService.send(content);
    }
}
