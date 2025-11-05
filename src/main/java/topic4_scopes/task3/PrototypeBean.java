package topic4_scopes.task3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    private int instanceId;
    private static int counter;
    public PrototypeBean() {
        System.out.println("PrototypeBean: new instance created");
        instanceId = ++counter;
    }
    public void showId(){
        System.out.println("PrototypeBean ID: " + instanceId);
    }
}
