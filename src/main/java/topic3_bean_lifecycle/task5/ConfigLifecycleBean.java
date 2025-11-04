package topic3_bean_lifecycle.task5;

public class ConfigLifecycleBean {
    public ConfigLifecycleBean() {
        System.out.println("ConfigLifecycleBean: constructor called");
    }
    public void customInit() {
        System.out.println("ConfigLifecycleBean: customInit called");
    }
    public void customDestroy() {
        System.out.println("ConfigLifecycleBean: customDestroy called");
    }
}

