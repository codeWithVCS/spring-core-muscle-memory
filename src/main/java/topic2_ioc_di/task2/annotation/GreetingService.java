package topic2_ioc_di.task2.annotation;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public void greet(){
        System.out.println("Hello from Annotation-based Bean!");
    }
}
