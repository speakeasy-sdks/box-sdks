package .models.operations;



public class GetSharedItemsRequest {
    public .models.utils.RetryConfig retries;
    public GetSharedItemsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetSharedItemsQueryParams queryParams;
    public GetSharedItemsRequest withQueryParams(GetSharedItemsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public GetSharedItemsHeaders headers;
    public GetSharedItemsRequest withHeaders(GetSharedItemsHeaders headers) {
        this.headers = headers;
        return this;
    }
}