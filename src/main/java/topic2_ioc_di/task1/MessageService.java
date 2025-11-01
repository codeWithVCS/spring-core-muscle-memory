package topic2_ioc_di.task1;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public void getMessage(){
        System.out.println("Greetings! MessageService bean has been initialized successfully");
    }
}
