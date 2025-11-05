package topic4_scopes.task4;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    private final ObjectProvider<PrototypeTask> prototypeTaskProvider;

    public TaskManager(ObjectProvider<PrototypeTask> prototypeTaskProvider) {
        this.prototypeTaskProvider = prototypeTaskProvider;
    }

    public void runTasks() {
        for (int i = 0; i < 3; i++) {
            PrototypeTask task = prototypeTaskProvider.getObject(); // fetch fresh instance
            task.execute();
        }
    }
}
