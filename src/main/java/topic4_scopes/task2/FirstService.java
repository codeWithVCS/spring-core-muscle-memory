package topic4_scopes.task2;

import org.springframework.stereotype.Component;

@Component
public class FirstService {
    private final SharedResource sharedResource;
    public FirstService(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }
    public void execute() {
        sharedResource.use("FirstService");
    }
}
