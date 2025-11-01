package topic2_ioc_di.task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:topic2_ioc_di/task3/beans.xml")
public class AppConfig {
    @Bean
    public UtilityService utilityService(){
        return new UtilityService();
    }
}
