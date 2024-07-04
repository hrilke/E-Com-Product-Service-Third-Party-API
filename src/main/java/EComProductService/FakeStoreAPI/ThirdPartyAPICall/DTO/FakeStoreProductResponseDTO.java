package EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.Product;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.Rating;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductResponseDTO {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private FakeStoreRatingResponseDTO rating;

    public static Product from(FakeStoreProductResponseDTO productDTO, Rating rating) {
        Product product = new Product();
        FakeStoreRatingResponseDTO ratingDTO = productDTO.getRating();
        product.setId(productDTO.getId());
        product.setPrice(productDTO.getPrice());
        product.setImage(productDTO.getImage());
        product.setTitle(productDTO.getTitle());
        product.setCategory(productDTO.getCategory());
        product.setDescription(productDTO.getDescription());
        product.setRating(rating);
        return product;
    }
}
