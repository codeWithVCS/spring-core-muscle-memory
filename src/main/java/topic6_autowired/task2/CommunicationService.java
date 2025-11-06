package topic6_autowired.task2;

import org.springframework.stereotype.Component;

@Component
public class CommunicationService {
    private final SmsService smsService;
    private final EmailService emailService;
    public CommunicationService(SmsService smsService, EmailService emailService) {
        this.smsService = smsService;
        this.emailService = emailService;
    }
    public void notifyUser(String user){
        System.out.println("CommunicationService: preparing notifications for " + user);
        smsService.sendSms(user);
        emailService.sendEmail(user);
    }
}
