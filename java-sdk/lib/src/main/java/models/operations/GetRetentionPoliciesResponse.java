package .models.operations;



public class GetRetentionPoliciesResponse {
    public .models.shared.ClientError clientError;
    public GetRetentionPoliciesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetRetentionPoliciesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RetentionPolicies retentionPolicies;
    public GetRetentionPoliciesResponse withRetentionPolicies(.models.shared.RetentionPolicies retentionPolicies) {
        this.retentionPolicies = retentionPolicies;
        return this;
    }
    public Long statusCode;
    public GetRetentionPoliciesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}