package .models.operations;



public class GetSignRequestsResponseOutput {
    public .models.shared.ClientError clientError;
    public GetSignRequestsResponseOutput withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetSignRequestsResponseOutput withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SignRequestsOutput signRequests;
    public GetSignRequestsResponseOutput withSignRequests(.models.shared.SignRequestsOutput signRequests) {
        this.signRequests = signRequests;
        return this;
    }
    public Long statusCode;
    public GetSignRequestsResponseOutput withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}