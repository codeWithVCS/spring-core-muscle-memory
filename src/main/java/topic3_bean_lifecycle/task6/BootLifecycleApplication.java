package topic3_bean_lifecycle.task6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootLifecycleApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running BootLifecycleApplication");
    }

    public static void main(String[] args) {
        SpringApplication.run(BootLifecycleApplication.class, args);
    }
}
