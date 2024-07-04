package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Service;

import EComProductService.FakeStoreAPI.ThirdPartyAPICall.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CartRepository cartRepository;
}
