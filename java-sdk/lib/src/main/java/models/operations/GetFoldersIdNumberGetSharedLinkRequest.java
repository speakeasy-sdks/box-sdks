package .models.operations;



public class GetFoldersIdNumberGetSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public GetFoldersIdNumberGetSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFoldersIdNumberGetSharedLinkPathParams pathParams;
    public GetFoldersIdNumberGetSharedLinkRequest withPathParams(GetFoldersIdNumberGetSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFoldersIdNumberGetSharedLinkQueryParams queryParams;
    public GetFoldersIdNumberGetSharedLinkRequest withQueryParams(GetFoldersIdNumberGetSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}