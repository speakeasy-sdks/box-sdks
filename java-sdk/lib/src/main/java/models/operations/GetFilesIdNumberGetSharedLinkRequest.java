package .models.operations;



public class GetFilesIdNumberGetSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdNumberGetSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdNumberGetSharedLinkPathParams pathParams;
    public GetFilesIdNumberGetSharedLinkRequest withPathParams(GetFilesIdNumberGetSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdNumberGetSharedLinkQueryParams queryParams;
    public GetFilesIdNumberGetSharedLinkRequest withQueryParams(GetFilesIdNumberGetSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}