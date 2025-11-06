package topic7_java_config.task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "topic7_java_config.task4")
public class AppConfig {
    @Bean
    public Logger logger() {
        System.out.println("AppConfig: Logger bean created");
        return new Logger();
    }
}
