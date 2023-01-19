package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberRemoveSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutFoldersIdNumberRemoveSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFoldersIdNumberRemoveSharedLinkPathParams pathParams;
    public PutFoldersIdNumberRemoveSharedLinkRequest withPathParams(PutFoldersIdNumberRemoveSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFoldersIdNumberRemoveSharedLinkQueryParams queryParams;
    public PutFoldersIdNumberRemoveSharedLinkRequest withQueryParams(PutFoldersIdNumberRemoveSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFoldersIdNumberRemoveSharedLinkRequestBody request;
    public PutFoldersIdNumberRemoveSharedLinkRequest withRequest(PutFoldersIdNumberRemoveSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}