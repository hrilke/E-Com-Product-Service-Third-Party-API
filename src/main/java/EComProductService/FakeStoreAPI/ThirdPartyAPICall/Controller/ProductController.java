package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Controller;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.FakeStoreProductResponseDTO;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
