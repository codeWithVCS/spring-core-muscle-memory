package topic8_value_injection.task5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "topic8_value_injection.task5")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
