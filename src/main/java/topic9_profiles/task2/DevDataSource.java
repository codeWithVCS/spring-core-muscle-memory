package topic9_profiles.task2;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataSource implements DataSource {
    @Override
    public void connect() {
        System.out.println("DevDataSource: Connected to Development Database");
    }
}
