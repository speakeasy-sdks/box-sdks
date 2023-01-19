package .models.operations;



public class PutLegalHoldPoliciesIdResponse {
    public .models.shared.ClientError clientError;
    public PutLegalHoldPoliciesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutLegalHoldPoliciesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.LegalHoldPolicy legalHoldPolicy;
    public PutLegalHoldPoliciesIdResponse withLegalHoldPolicy(.models.shared.LegalHoldPolicy legalHoldPolicy) {
        this.legalHoldPolicy = legalHoldPolicy;
        return this;
    }
    public Long statusCode;
    public PutLegalHoldPoliciesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}