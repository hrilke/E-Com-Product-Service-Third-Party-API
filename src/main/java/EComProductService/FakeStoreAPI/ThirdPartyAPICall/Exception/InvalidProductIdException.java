package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Exception;

public class InvalidProductIdException extends RuntimeException {
    public InvalidProductIdException(String message) {
        super(message);
    }
}
