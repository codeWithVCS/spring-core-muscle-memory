package topic5_component_scanning.task5;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public String getProduct(String productId) {
        System.out.println("ProductService: getting product " + productId);
        String result = productRepository.findProduct(productId);
        return result;
    }
}
