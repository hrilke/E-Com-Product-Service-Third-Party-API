package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Exception;

import jakarta.annotation.security.RunAs;

public class InvalidCategoryException extends RuntimeException {
    public InvalidCategoryException(String message) {
        super(message);
    }
}
