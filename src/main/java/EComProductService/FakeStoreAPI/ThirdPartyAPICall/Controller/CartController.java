package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Controller;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CarService cartService;

}
