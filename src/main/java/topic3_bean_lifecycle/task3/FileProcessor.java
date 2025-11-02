package topic3_bean_lifecycle.task3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class FileProcessor implements InitializingBean, DisposableBean {
    public FileProcessor() {
        System.out.println("FileProcessor: constructor called");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("FileProcessor: resources initialized");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("FileProcessor: cleanup done");
    }
    public void processFile(){
        System.out.println("FileProcessor: processing file...");
    }
}
