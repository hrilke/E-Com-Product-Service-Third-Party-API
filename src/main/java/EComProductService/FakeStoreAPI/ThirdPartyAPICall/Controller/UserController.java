package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Controller;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

}
