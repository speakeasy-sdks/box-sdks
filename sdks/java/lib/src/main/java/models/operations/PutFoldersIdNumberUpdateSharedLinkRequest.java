package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberUpdateSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutFoldersIdNumberUpdateSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFoldersIdNumberUpdateSharedLinkPathParams pathParams;
    public PutFoldersIdNumberUpdateSharedLinkRequest withPathParams(PutFoldersIdNumberUpdateSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFoldersIdNumberUpdateSharedLinkQueryParams queryParams;
    public PutFoldersIdNumberUpdateSharedLinkRequest withQueryParams(PutFoldersIdNumberUpdateSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFoldersIdNumberUpdateSharedLinkRequestBody request;
    public PutFoldersIdNumberUpdateSharedLinkRequest withRequest(PutFoldersIdNumberUpdateSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}