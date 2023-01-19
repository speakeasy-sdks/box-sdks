package .models.operations;



public class GetRecentItemsRequest {
    public .models.utils.RetryConfig retries;
    public GetRecentItemsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetRecentItemsQueryParams queryParams;
    public GetRecentItemsRequest withQueryParams(GetRecentItemsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}