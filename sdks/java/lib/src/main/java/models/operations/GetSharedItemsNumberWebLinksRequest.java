package .models.operations;



public class GetSharedItemsNumberWebLinksRequest {
    public .models.utils.RetryConfig retries;
    public GetSharedItemsNumberWebLinksRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetSharedItemsNumberWebLinksQueryParams queryParams;
    public GetSharedItemsNumberWebLinksRequest withQueryParams(GetSharedItemsNumberWebLinksQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public GetSharedItemsNumberWebLinksHeaders headers;
    public GetSharedItemsNumberWebLinksRequest withHeaders(GetSharedItemsNumberWebLinksHeaders headers) {
        this.headers = headers;
        return this;
    }
}