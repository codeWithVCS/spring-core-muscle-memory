package topic7_java_config.task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(initMethod = "initialize", destroyMethod = "cleanup")
    @Scope("prototype")
    public TaskProcessor taskProcessor(){
        return new TaskProcessor();
    }

}
