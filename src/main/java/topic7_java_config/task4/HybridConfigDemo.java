package topic7_java_config.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HybridConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        Logger logger = context.getBean(Logger.class);
        accountService.processAccount("ACC-7001");
        logger.log("Account processing completed.");
        context.close();
    }
}
