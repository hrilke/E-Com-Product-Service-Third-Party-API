package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.FakeStoreProductResponseDTO;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    FakeStoreProductResponseDTO getProduct(int productId);
    FakeStoreProductResponseDTO addProduct(Product product);
    FakeStoreProductResponseDTO updateProduct(Product product, int productId);
    boolean deleteProduct(int productId);
}
