package .models.operations;



public class PostWorkflowsIdStartResponse {
    public .models.shared.ClientError clientError;
    public PostWorkflowsIdStartResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostWorkflowsIdStartResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostWorkflowsIdStartResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}