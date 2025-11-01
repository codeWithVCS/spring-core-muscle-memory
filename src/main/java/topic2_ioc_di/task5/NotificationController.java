package topic2_ioc_di.task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {
    private NotificationService notificationService;

    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void trigger(String message) {
        System.out.println("NotificationController: request received");
        notificationService.notifyUser(message);
        System.out.println("NotificationController: response sent");
    }
}
