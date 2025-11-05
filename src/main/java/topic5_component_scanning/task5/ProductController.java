package topic5_component_scanning.task5;

import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    public void handleRequest(String productId) {
        System.out.println("ProductController: request for " +  productId);
        String result = productService.getProduct(productId);
        System.out.println("ProductController: response sent -> " + result);
    }
}
