package topic3_bean_lifecycle.task5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class AnnotationLifecycleBean {
    public AnnotationLifecycleBean() {
        System.out.println("AnnotationLifecycleBean: Constructor called");
    }
    @PostConstruct
    public void init() {
        System.out.println("AnnotationLifecycleBean: PostConstruct called");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("AnnotationLifecycleBean: PreDestroy called");
    }
}
