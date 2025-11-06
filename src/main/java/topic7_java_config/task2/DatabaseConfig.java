package topic7_java_config.task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource(){
        System.out.println("DatabaseConfig: DataSource bean created");
        return new DataSource();
    }
    @Bean
    public DatabaseRepository databaseRepository(){
        System.out.println("DatabaseConfig: DatabaseRepository bean created");
        return new DatabaseRepository(dataSource());
    }
}
