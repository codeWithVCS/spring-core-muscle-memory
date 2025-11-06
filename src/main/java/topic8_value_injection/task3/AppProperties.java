package topic8_value_injection.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppProperties {
    @Value("${app.supproted.languages}")
    private String[] languages;
    @Value("#{'${app.active.profiles}'.split(',')}")
    private List<String> profiles;
    public void printCollections(){
        System.out.print("Supported languages: " );
        for (String language : languages) {
            System.out.print(language + ", ");
        }
        System.out.println();
        System.out.println("Active profiles: " + profiles);
    }
}
