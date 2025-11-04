package topic3_bean_lifecycle.task5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "topic3_bean_lifecycle.task5")
public class AppConfig {
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public ConfigLifecycleBean configLifecycleBean() {
        return new ConfigLifecycleBean();
    }
}
