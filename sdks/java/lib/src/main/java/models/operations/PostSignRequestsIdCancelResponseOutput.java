package .models.operations;



public class PostSignRequestsIdCancelResponseOutput {
    public .models.shared.ClientError clientError;
    public PostSignRequestsIdCancelResponseOutput withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostSignRequestsIdCancelResponseOutput withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SignRequestOutput signRequest;
    public PostSignRequestsIdCancelResponseOutput withSignRequest(.models.shared.SignRequestOutput signRequest) {
        this.signRequest = signRequest;
        return this;
    }
    public Long statusCode;
    public PostSignRequestsIdCancelResponseOutput withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}