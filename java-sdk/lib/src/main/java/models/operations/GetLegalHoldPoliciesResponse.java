package .models.operations;



public class GetLegalHoldPoliciesResponse {
    public .models.shared.ClientError clientError;
    public GetLegalHoldPoliciesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetLegalHoldPoliciesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.LegalHoldPolicies legalHoldPolicies;
    public GetLegalHoldPoliciesResponse withLegalHoldPolicies(.models.shared.LegalHoldPolicies legalHoldPolicies) {
        this.legalHoldPolicies = legalHoldPolicies;
        return this;
    }
    public Long statusCode;
    public GetLegalHoldPoliciesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}