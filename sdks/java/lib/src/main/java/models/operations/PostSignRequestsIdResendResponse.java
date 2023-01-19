package .models.operations;



public class PostSignRequestsIdResendResponse {
    public .models.shared.ClientError clientError;
    public PostSignRequestsIdResendResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostSignRequestsIdResendResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostSignRequestsIdResendResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}