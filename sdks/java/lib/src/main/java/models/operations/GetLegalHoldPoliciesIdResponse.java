package .models.operations;



public class GetLegalHoldPoliciesIdResponse {
    public .models.shared.ClientError clientError;
    public GetLegalHoldPoliciesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetLegalHoldPoliciesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.LegalHoldPolicy legalHoldPolicy;
    public GetLegalHoldPoliciesIdResponse withLegalHoldPolicy(.models.shared.LegalHoldPolicy legalHoldPolicy) {
        this.legalHoldPolicy = legalHoldPolicy;
        return this;
    }
    public Long statusCode;
    public GetLegalHoldPoliciesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}