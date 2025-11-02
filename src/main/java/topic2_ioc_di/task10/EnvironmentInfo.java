package topic2_ioc_di.task10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentInfo {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.default.user:DefaultUser}")
    private String defaultUser;

    @Value("#{systemProperties.['os.name']}")
    private String operatingSystem;

    public void printEnvironmentDetails(){
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
        System.out.println("Default User: " + defaultUser);
        System.out.println("Operating System: " + operatingSystem);
    }
}
