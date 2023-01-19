package .models.operations;



public class GetFolderLocksRequest {
    public .models.utils.RetryConfig retries;
    public GetFolderLocksRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFolderLocksQueryParams queryParams;
    public GetFolderLocksRequest withQueryParams(GetFolderLocksQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}