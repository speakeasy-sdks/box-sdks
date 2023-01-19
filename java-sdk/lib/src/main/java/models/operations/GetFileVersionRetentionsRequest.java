package .models.operations;



public class GetFileVersionRetentionsRequest {
    public .models.utils.RetryConfig retries;
    public GetFileVersionRetentionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFileVersionRetentionsQueryParams queryParams;
    public GetFileVersionRetentionsRequest withQueryParams(GetFileVersionRetentionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}