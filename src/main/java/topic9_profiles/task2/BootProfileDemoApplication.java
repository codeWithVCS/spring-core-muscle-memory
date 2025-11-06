package topic9_profiles.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProfileDemoApplication implements CommandLineRunner {
    @Autowired
    private DataSource dataSource;
    @Override
    public void run(String... args) throws Exception {
        dataSource.connect();
    }

    public static void main(String[] args) {
        SpringApplication.run(BootProfileDemoApplication.class, args);
    }
}
