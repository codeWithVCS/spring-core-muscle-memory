package topic6_autowired.task8;

import org.springframework.stereotype.Service;

@Service("emailNotificationService")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("EmailNotificationService: sending EMAIL -> " + message);
    }
}
