package .models.operations;



public class GetFileVersionLegalHoldsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetFileVersionLegalHoldsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFileVersionLegalHoldsIdPathParams pathParams;
    public GetFileVersionLegalHoldsIdRequest withPathParams(GetFileVersionLegalHoldsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}