package .models.operations;



public class GetRetentionPoliciesIdResponse {
    public .models.shared.ClientError clientError;
    public GetRetentionPoliciesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetRetentionPoliciesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RetentionPolicy retentionPolicy;
    public GetRetentionPoliciesIdResponse withRetentionPolicy(.models.shared.RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
    public Long statusCode;
    public GetRetentionPoliciesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}