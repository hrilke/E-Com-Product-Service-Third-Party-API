package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Controller;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.FakeStoreProductResponseDTO;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Exception.InvalidCategoryException;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Exception.InvalidProductIdException;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity getAllProducts() {
        List<FakeStoreProductResponseDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity getProductById(@PathVariable("id") int productId) {
        if (productId < 1 || productId > 20) {
            throw new InvalidProductIdException("Product Doesn't Exit with this Product ID");
        }
        return ResponseEntity.ok(productService.getProduct(productId));
    }
    @GetMapping("/product/category/{category}")
    public ResponseEntity getProductsInCategory(@PathVariable("category") String category) {
        if (category.equals("electronics")
            || category.equals("jewelery")
            || category.equals("men's clothing")
            || category.equals("women's clothing")) {
            List<FakeStoreProductResponseDTO> products = productService.getProductsInCategory(category);
            return ResponseEntity.ok(products);
        }
        throw new InvalidCategoryException("This Category Does Not Exist");
    }

}
