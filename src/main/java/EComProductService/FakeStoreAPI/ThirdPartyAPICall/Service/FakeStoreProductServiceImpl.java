package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.APIClient;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.FakeStoreProductResponseDTO;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService{
    @Autowired
    private APIClient apiClient;

    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStoreProducts = apiClient.getAllProducts();
        return fakeStoreProducts;
    }

    @Override
    public List<FakeStoreProductResponseDTO> getProductsInCategory(String categoryName) {
        List<FakeStoreProductResponseDTO> fakeStoreProductsInCategory = apiClient.getProductsInCategory(categoryName);
        return fakeStoreProductsInCategory;
    }

    @Override
    public FakeStoreProductResponseDTO getProduct(int productId) {
        FakeStoreProductResponseDTO fakeStoreProduct = apiClient.getProductById(productId);
        return fakeStoreProduct;
    }

    @Override
    public FakeStoreProductResponseDTO addProduct(Product product) {
        return null;
    }

    @Override
    public FakeStoreProductResponseDTO updateProduct(Product product, int productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }
}
