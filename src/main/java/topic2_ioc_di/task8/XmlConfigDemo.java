package topic2_ioc_di.task8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("topic2_ioc_di/task8/beans.xml");
        OrderController orderController = context.getBean(OrderController.class);
        orderController.createOrder("ORD-2001");
        context.close();
    }
}
