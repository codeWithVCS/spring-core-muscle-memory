package topic8_value_injection.task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String version;
    @Value("${app.active}")
    private String active;
    public void printProperties() {
        System.out.println("App Name: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Active: " + active);
    }
}
