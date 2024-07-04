package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Repository;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.Rating;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
}
