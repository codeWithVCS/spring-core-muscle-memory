package topic8_value_injection.task2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("${server.port}")
    private String port;
    @Value("${app.title}")
    private String title;

    public void showConfig(){
        System.out.println("Server Port: " + port);
        System.out.println("Title: " + title);
    }
}
