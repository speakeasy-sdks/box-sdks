package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberAddSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutFoldersIdNumberAddSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFoldersIdNumberAddSharedLinkPathParams pathParams;
    public PutFoldersIdNumberAddSharedLinkRequest withPathParams(PutFoldersIdNumberAddSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFoldersIdNumberAddSharedLinkQueryParams queryParams;
    public PutFoldersIdNumberAddSharedLinkRequest withQueryParams(PutFoldersIdNumberAddSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFoldersIdNumberAddSharedLinkRequestBody request;
    public PutFoldersIdNumberAddSharedLinkRequest withRequest(PutFoldersIdNumberAddSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}