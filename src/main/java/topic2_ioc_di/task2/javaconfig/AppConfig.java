package topic2_ioc_di.task2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public WelcomeService welcomeService(){
        return new WelcomeService();
    }
}
