package .models.operations;



public class GetSharedItemsNumberFoldersRequest {
    public .models.utils.RetryConfig retries;
    public GetSharedItemsNumberFoldersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetSharedItemsNumberFoldersQueryParams queryParams;
    public GetSharedItemsNumberFoldersRequest withQueryParams(GetSharedItemsNumberFoldersQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public GetSharedItemsNumberFoldersHeaders headers;
    public GetSharedItemsNumberFoldersRequest withHeaders(GetSharedItemsNumberFoldersHeaders headers) {
        this.headers = headers;
        return this;
    }
}