package topic5_component_scanning.task2;

import org.springframework.stereotype.Component;

@Component
public class CounterComponent {
    private int count = 0;
    public void increment(){
        count++;
        System.out.println("CounterComponent: increment called, count = " + count);
    }
    public int getCount(){
        System.out.println("CounterComponent: current count = " + count);
        return count;
    }
}
