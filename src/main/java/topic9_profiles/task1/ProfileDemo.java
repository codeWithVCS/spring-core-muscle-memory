package topic9_profiles.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(AppConfig.class);
        context.refresh();
        DataSource dataSource = context.getBean(DataSource.class);
        dataSource.connect();
        context.close();
    }
}
