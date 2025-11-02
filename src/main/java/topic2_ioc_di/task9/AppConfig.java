package topic2_ioc_di.task9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:topic2_ioc_di/task9/beans.xml")
@ComponentScan("topic2_ioc_di.task9")
public class AppConfig {
    @Bean
    public CustomerService customerService(CustomerRepository customerRepository) {
        return new CustomerService(customerRepository);
    }
}
