package EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.ProductRating;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreRatingResponseDTO {
    private double rate;
    private int count;

    public static ProductRating from(FakeStoreRatingResponseDTO ratingDTO) {
        ProductRating productRating = new ProductRating();
        productRating.setRating(ratingDTO.getRate());
        productRating.setCount(ratingDTO.getCount());
        return productRating;
    }
}
