package topic6_autowired.task8;

import org.springframework.stereotype.Service;

@Service("smsNotificationService")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SmsNotificationService: sending SMS -> " + message);
    }
}
