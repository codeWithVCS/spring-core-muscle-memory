package topic4_scopes.task2;

import org.springframework.stereotype.Component;

@Component
public class SecondService {
    private final SharedResource sharedResource;
    public SecondService(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }
    public void execute() {
        sharedResource.use("SecondService");
    }
}
