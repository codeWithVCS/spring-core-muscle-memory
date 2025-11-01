package topic2_ioc_di.task5;

import org.springframework.stereotype.Repository;

@Repository
public class InventoryRepository {
    public void find(String item) {
        System.out.println("InventoryRepository: found item " + item);
    }
}
