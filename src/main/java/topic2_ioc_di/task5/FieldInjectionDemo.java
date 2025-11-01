package topic2_ioc_di.task5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldInjectionDemo {
    public static void main(String[] args) {
//        InventoryService inventoryService = new InventoryService();
//        inventoryService.checkInventory("Laptop");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("topic2_ioc_di.task5");
        context.refresh();
        InventoryService inventoryService1 = context.getBean(InventoryService.class);
        inventoryService1.checkInventory("Laptop");
        context.close();
    }
}
