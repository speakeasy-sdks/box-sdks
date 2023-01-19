package .models.operations;



public class GetCollaborationWhitelistEntriesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetCollaborationWhitelistEntriesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCollaborationWhitelistEntriesIdPathParams pathParams;
    public GetCollaborationWhitelistEntriesIdRequest withPathParams(GetCollaborationWhitelistEntriesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}