package topic2_ioc_di.task9;

import org.springframework.stereotype.Component;

@Component
public class AuditService {
    public void log(String action){
        System.out.println("AuditService (Annotation): logged action - <" + action + ">");
    }
}
