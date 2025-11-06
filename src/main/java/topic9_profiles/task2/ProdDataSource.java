package topic9_profiles.task2;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDataSource implements DataSource {
    @Override
    public void connect() {
        System.out.println("ProdDataSource: Connected to Production Database");
    }
}
