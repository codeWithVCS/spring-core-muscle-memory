package topic2_ioc_di.task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private InventoryRepository inventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public void checkInventory(String item){
        System.out.println("InventoryService: checking stock for " + item);
        inventoryRepository.find(item);
        System.out.println("InventoryService: stock check completed");
    }
}
