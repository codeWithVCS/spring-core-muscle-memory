package topic2_ioc_di.task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private Notifier notifier;

    @Autowired
    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        System.out.println("NotificationService: preparing to notify user");
        notifier.send(message);
        System.out.println("NotificationService: notification completed");
    }
}
