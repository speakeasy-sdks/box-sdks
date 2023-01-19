package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberRemoveSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdNumberRemoveSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdNumberRemoveSharedLinkPathParams pathParams;
    public PutFilesIdNumberRemoveSharedLinkRequest withPathParams(PutFilesIdNumberRemoveSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFilesIdNumberRemoveSharedLinkQueryParams queryParams;
    public PutFilesIdNumberRemoveSharedLinkRequest withQueryParams(PutFilesIdNumberRemoveSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFilesIdNumberRemoveSharedLinkRequestBody request;
    public PutFilesIdNumberRemoveSharedLinkRequest withRequest(PutFilesIdNumberRemoveSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}