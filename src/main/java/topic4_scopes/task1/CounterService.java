package topic4_scopes.task1;

import org.springframework.stereotype.Component;

@Component
public class CounterService {
    private int counter = 0;
    public void  increment(){
        counter++;
        System.out.println("Incremented the value of counter, new value is " + counter);
    }
    public int getValue(){
        System.out.println("The value of counter is " + counter);
        return counter;
    }
}
