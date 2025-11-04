package topic3_bean_lifecycle.task6;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ResourceMonitor {
    public ResourceMonitor() {
        System.out.println("ResourceMonitor- constructor called");
    }
    @PostConstruct
    public void inti(){
        System.out.println("ResourceMonitor-inti called");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("ResourceMonitor-destroy called");
    }
    public void monitor(){
        System.out.println("ResourceMonitor: monitoring active resources...");
    }
}
