package .models.operations;



public class PostLegalHoldPoliciesResponse {
    public .models.shared.ClientError clientError;
    public PostLegalHoldPoliciesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostLegalHoldPoliciesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.LegalHoldPolicy legalHoldPolicy;
    public PostLegalHoldPoliciesResponse withLegalHoldPolicy(.models.shared.LegalHoldPolicy legalHoldPolicy) {
        this.legalHoldPolicy = legalHoldPolicy;
        return this;
    }
    public Long statusCode;
    public PostLegalHoldPoliciesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}