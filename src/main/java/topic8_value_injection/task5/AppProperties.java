package topic8_value_injection.task5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("${app.timeout : 30}")
    private int timeout;
    @Value("#{${app.max.users} * 2}")
    private int scaledUserLimit;
    @Value("Welcome to #{'${app.name}'}!")
    private String welcomeMessage;

    public void printValues(){
        System.out.println(welcomeMessage);
        System.out.println("Timeout = " + timeout);
        System.out.println("ScaledUserLimit = " + scaledUserLimit);
    }
}
