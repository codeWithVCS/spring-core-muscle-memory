package topic2_ioc_di.task2.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("topic2_ioc_di/task2/beans.xml");
        FarewellService farewellService = context.getBean(FarewellService.class);
        farewellService.sayGoodbye();
    }
}
