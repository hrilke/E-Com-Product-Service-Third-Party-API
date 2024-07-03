package EComProductService.FakeStoreAPI.ThirdPartyAPICall;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.FakeStoreProductResponseDTO;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.FakeStoreRatingResponseDTO;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class APIClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}")
    private String fakeStoreBaseUrl;
    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath;
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        String fakeStoreAllProductUrl = fakeStoreBaseUrl.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponseDTOList = restTemplate.getForEntity(fakeStoreAllProductUrl, FakeStoreProductResponseDTO[].class);
        return List.of(productResponseDTOList.getBody());
    }
}
