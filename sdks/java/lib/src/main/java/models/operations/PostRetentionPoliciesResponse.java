package .models.operations;



public class PostRetentionPoliciesResponse {
    public .models.shared.ClientError clientError;
    public PostRetentionPoliciesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostRetentionPoliciesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RetentionPolicy retentionPolicy;
    public PostRetentionPoliciesResponse withRetentionPolicy(.models.shared.RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
    public Long statusCode;
    public PostRetentionPoliciesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}