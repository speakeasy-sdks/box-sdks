package .models.operations;



public class GetFileVersionLegalHoldsRequest {
    public .models.utils.RetryConfig retries;
    public GetFileVersionLegalHoldsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFileVersionLegalHoldsQueryParams queryParams;
    public GetFileVersionLegalHoldsRequest withQueryParams(GetFileVersionLegalHoldsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}