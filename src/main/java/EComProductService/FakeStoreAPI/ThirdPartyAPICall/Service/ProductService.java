package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.APIClient;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.FakeStoreProductResponseDTO;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.FakeStoreRatingResponseDTO;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.Product;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.ProductRating;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Repository.ProductRepository;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {   
    @Autowired
    private APIClient apiClient;
    @Autowired(required = true)
    private ProductRepository productRepository;

    @Autowired
    private RatingRepository ratingRepository;

    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStoreProducts = apiClient.getAllProducts();
        for (FakeStoreProductResponseDTO productDTO : fakeStoreProducts) {
            ProductRating productRating = FakeStoreRatingResponseDTO.from(productDTO.getRating());
            ratingRepository.save(productRating);
            Product product = FakeStoreProductResponseDTO.from(productDTO, productRating);
            productRepository.save(product);
        }
        return fakeStoreProducts;
    }


    public List<FakeStoreProductResponseDTO> getProductsInCategory(String categoryName) {
        List<FakeStoreProductResponseDTO> fakeStoreProductsInCategory = apiClient.getProductsInCategory(categoryName);
        return fakeStoreProductsInCategory;
    }


    public FakeStoreProductResponseDTO getProduct(int productId) {
        FakeStoreProductResponseDTO fakeStoreProduct = apiClient.getProductById(productId);
        return fakeStoreProduct;
    }



    public List<FakeStoreProductResponseDTO> getProductSortedInDescOrder(String descOrder) {
        List<FakeStoreProductResponseDTO> productList = apiClient.getSortedProductsInDescOrder(descOrder);
        return productList;
    }
}
