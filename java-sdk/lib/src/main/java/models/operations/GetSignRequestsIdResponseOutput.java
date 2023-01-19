package .models.operations;



public class GetSignRequestsIdResponseOutput {
    public .models.shared.ClientError clientError;
    public GetSignRequestsIdResponseOutput withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetSignRequestsIdResponseOutput withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SignRequestOutput signRequest;
    public GetSignRequestsIdResponseOutput withSignRequest(.models.shared.SignRequestOutput signRequest) {
        this.signRequest = signRequest;
        return this;
    }
    public Long statusCode;
    public GetSignRequestsIdResponseOutput withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}