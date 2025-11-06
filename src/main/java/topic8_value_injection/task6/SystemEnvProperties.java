package topic8_value_injection.task6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemEnvProperties {
    @Value("${USERNAME:UnknownUser}")
    private String user;
    @Value("${java.version}")
    private String javaVersion;
    @Value("${app.mode:default}")
    private String mode;
    @Value("#{systemProperties['os.name']}")
    private String osName;

    public void printEnvironmentDetails() {
        System.out.println("User: " + user);
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Mode: " + mode);
        System.out.println("OS name: " + osName);
    }
}
