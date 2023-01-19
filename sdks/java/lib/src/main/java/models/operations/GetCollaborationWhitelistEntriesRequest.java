package .models.operations;



public class GetCollaborationWhitelistEntriesRequest {
    public .models.utils.RetryConfig retries;
    public GetCollaborationWhitelistEntriesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCollaborationWhitelistEntriesQueryParams queryParams;
    public GetCollaborationWhitelistEntriesRequest withQueryParams(GetCollaborationWhitelistEntriesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}