package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Repository;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.ProductRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<ProductRating, Integer> {
}
