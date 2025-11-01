package topic2_ioc_di.task5;

import org.springframework.stereotype.Component;

@Component
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("EmailNotifier: sending email with message -" + message);
    }
}
