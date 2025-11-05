package topic5_component_scanning.task5;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public String findProduct(String productId) {
        System.out.println("ProductRepository: fetching product "  + productId);
        return "Product-" + productId;
    }
}
