package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberUpdateSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdNumberUpdateSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdNumberUpdateSharedLinkPathParams pathParams;
    public PutFilesIdNumberUpdateSharedLinkRequest withPathParams(PutFilesIdNumberUpdateSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFilesIdNumberUpdateSharedLinkQueryParams queryParams;
    public PutFilesIdNumberUpdateSharedLinkRequest withQueryParams(PutFilesIdNumberUpdateSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFilesIdNumberUpdateSharedLinkRequestBody request;
    public PutFilesIdNumberUpdateSharedLinkRequest withRequest(PutFilesIdNumberUpdateSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}