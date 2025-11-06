package topic7_java_config.task3;

public class TaskProcessor {
    public TaskProcessor(){
        System.out.println("TaskProcessor: constructor called");
    }
    public void initialize(){
        System.out.println("TaskProcessor: custom init method");
    }
    public void cleanup(){
        System.out.println("TaskProcessor: custom destroy method");
    }
    public void execute(){
        System.out.println("TaskProcessor: executing...");
    }
}
