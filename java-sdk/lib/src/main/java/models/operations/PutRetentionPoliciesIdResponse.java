package .models.operations;



public class PutRetentionPoliciesIdResponse {
    public .models.shared.ClientError clientError;
    public PutRetentionPoliciesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutRetentionPoliciesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RetentionPolicy retentionPolicy;
    public PutRetentionPoliciesIdResponse withRetentionPolicy(.models.shared.RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
    public Long statusCode;
    public PutRetentionPoliciesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}