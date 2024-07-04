package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Repository;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
