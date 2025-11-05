package topic5_component_scanning.task1;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public void greet(){
        System.out.println("Hello from GreetingService – discovered via @Component");
    }
}
