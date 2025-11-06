package topic6_autowired.task1;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    private final EmailService emailService;
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }
    public void send(String user){
        System.out.println("NotificationService: preparing notification for " + user);
        emailService.sendEmail(user);
    }
}
