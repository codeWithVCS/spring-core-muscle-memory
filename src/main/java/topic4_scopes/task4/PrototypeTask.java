package topic4_scopes.task4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeTask {
    private static int counter;
    private int taskId;
    public PrototypeTask() {
        taskId = ++counter;
        System.out.println("PrototypeTask: new instance created with ID " + taskId);
    }
    public void execute() {
        System.out.println("Executing PrototypeTask ID = " + taskId);
    }
}
