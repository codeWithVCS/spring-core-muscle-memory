package topic10_spel.task4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("#{userProfile.name}")
    private String userName;

    @Value("#{userProfile.age + 3}")
    private int futureAge;

    @Value("#{userProfile.getUserSummary()}")
    private String userSummary;

    public void printValues() {
        System.out.println("UserName: " + userName);
        System.out.println("Future Age: " + futureAge);
        System.out.println("UserSummary: " + userSummary);
    }
}
