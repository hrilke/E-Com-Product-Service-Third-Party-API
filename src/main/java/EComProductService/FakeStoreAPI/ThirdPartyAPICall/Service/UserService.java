package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Controller.UserController;
import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

}
