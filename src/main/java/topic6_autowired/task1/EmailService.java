package topic6_autowired.task1;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public void sendEmail(String to) {
        System.out.println("EmailService: sending email to " + to);
    }
}
