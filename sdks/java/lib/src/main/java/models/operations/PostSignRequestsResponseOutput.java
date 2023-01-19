package .models.operations;



public class PostSignRequestsResponseOutput {
    public .models.shared.ClientError clientError;
    public PostSignRequestsResponseOutput withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostSignRequestsResponseOutput withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SignRequestOutput signRequest;
    public PostSignRequestsResponseOutput withSignRequest(.models.shared.SignRequestOutput signRequest) {
        this.signRequest = signRequest;
        return this;
    }
    public Long statusCode;
    public PostSignRequestsResponseOutput withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}