package topic6_autowired.task2;

import org.springframework.stereotype.Component;

@Component
public class SmsService {
    public void sendSms(String to){
        System.out.println("SmsService: sending SMS to " + to);
    }
}
