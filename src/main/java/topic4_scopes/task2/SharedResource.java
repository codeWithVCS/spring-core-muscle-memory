package topic4_scopes.task2;

import org.springframework.stereotype.Component;

@Component
public class SharedResource {
    private int usageCount = 0;
    public void use(String callerName){
        usageCount++;
        System.out.println("SharedResource used by " +  callerName + ", usageCount = " +  usageCount);
    }
    public int getUsageCount() {
        System.out.println("SharedResource total usageCount = " + usageCount);
        return usageCount;
    }
}
