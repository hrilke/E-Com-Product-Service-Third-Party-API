package EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private int id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    private Double rating;

    public static ProductResponseDTO from(Product product) {
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setId(product.getId());
        responseDTO.setCategory(product.getCategory());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setImage(product.getImage());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setRating(product.getRating());
        return responseDTO;
    }
}
