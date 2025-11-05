package topic5_component_scanning.task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootComponentScanApplication implements CommandLineRunner {
    @Autowired
    private ProductController productController;
    @Override
    public void run(String... args) throws Exception {
        productController.handleRequest("PRD-900");
    }
    public static void main(String[] args) {
        SpringApplication.run(BootComponentScanApplication.class, args);
    }
}
