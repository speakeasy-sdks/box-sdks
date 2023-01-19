package .models.operations;



public class GetWebLinksIdNumberGetSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public GetWebLinksIdNumberGetSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetWebLinksIdNumberGetSharedLinkPathParams pathParams;
    public GetWebLinksIdNumberGetSharedLinkRequest withPathParams(GetWebLinksIdNumberGetSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetWebLinksIdNumberGetSharedLinkQueryParams queryParams;
    public GetWebLinksIdNumberGetSharedLinkRequest withQueryParams(GetWebLinksIdNumberGetSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}