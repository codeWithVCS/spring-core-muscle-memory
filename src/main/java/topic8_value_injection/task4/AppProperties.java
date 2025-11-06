package topic8_value_injection.task4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppProperties {
    @Value("#{'${app.modules:core,api,ui}'.split(',')}")
    private List<String> modules;
    @Value("#{'${app.features.enabled}'.split(',')}")
    private List<String> features;

    public void printCollections() {
        System.out.println("modules: " + modules);
        System.out.println("features: " + features);
    }
}
