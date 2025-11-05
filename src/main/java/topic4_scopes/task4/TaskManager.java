package topic4_scopes.task4;

import org.springframework.stereotype.Component;

@Component
public class TaskManager {
    private final PrototypeTask prototypeTask;
    public TaskManager(PrototypeTask prototypeTask) {
        this.prototypeTask = prototypeTask;
    }
    public void runTasks(){
        prototypeTask.execute();
        prototypeTask.execute();
        prototypeTask.execute();
    }
}
