package topic3_bean_lifecycle.task1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemoBean {
    public LifecycleDemoBean() {
        System.out.println("Constructor: Bean instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: Bean initialization logic executed");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("@PreDestroy: Bean cleanup logic executed");
    }
}
