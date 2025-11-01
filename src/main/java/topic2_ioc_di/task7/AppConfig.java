package topic2_ioc_di.task7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmployeeRepository employeeRepository(){
        return new EmployeeRepository();
    }

    @Bean
    public EmployeeService employeeService(){
        return new EmployeeService(employeeRepository());
    }

    @Bean
    public EmployeeController employeeController(){
        return new EmployeeController(employeeService());
    }
}
