package EComProductService.FakeStoreAPI.ThirdPartyAPICall.DTO;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.Rating;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreRatingResponseDTO {
    private double rate;
    private int count;

    public static Rating from(FakeStoreRatingResponseDTO ratingDTO) {
        Rating rating = new Rating();
        rating.setRating(ratingDTO.getRate());
        rating.setCount(ratingDTO.getCount());
        return rating;
    }
}
