package topic3_bean_lifecycle.task4;

public class ResourceManager {
    public ResourceManager() {
        System.out.println("ResourceManager: constructor called");
    }
    public void initializeResources(){
        System.out.println("ResourceManager: custom init – resources ready");
    }
    public void releaseResources(){
        System.out.println("ResourceManager: custom destroy – resources released");
    }
    public void allocate(String jobId){
        System.out.println("ResourceManager: allocated resources for " + jobId);
    }
    public void free(String jobId){
        System.out.println("ResourceManager: freed resources for " + jobId);
    }
}
