package topic9_profiles.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentService {
    @Value("${app.environment}")
    private String environment;
    @Value("${app.db.url}")
    private String dbUrl;
    @Value("${app.db.username}")
    private String dbUsername;
    public void printEnvironmentDetails(){
        System.out.println("Application Environment : " + environment);
        System.out.println("Database URL : " + dbUrl);
        System.out.println("Database Username : " + dbUsername);
    }
}
