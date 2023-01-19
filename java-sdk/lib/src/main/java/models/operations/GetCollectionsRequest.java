package .models.operations;



public class GetCollectionsRequest {
    public .models.utils.RetryConfig retries;
    public GetCollectionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCollectionsQueryParams queryParams;
    public GetCollectionsRequest withQueryParams(GetCollectionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}