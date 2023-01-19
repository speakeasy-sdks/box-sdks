package .models.operations;



public class PostMetadataCascadePoliciesIdApplyResponse {
    public .models.shared.ClientError clientError;
    public PostMetadataCascadePoliciesIdApplyResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostMetadataCascadePoliciesIdApplyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostMetadataCascadePoliciesIdApplyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}