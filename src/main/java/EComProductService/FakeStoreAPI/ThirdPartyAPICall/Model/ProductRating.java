package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductRating extends BaseEntity{
   private double rating;
   private int count;
}
