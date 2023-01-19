package .models.operations;



public class DeleteLegalHoldPoliciesIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteLegalHoldPoliciesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteLegalHoldPoliciesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteLegalHoldPoliciesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}