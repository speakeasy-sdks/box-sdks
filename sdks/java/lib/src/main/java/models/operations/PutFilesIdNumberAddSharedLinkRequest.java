package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberAddSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdNumberAddSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdNumberAddSharedLinkPathParams pathParams;
    public PutFilesIdNumberAddSharedLinkRequest withPathParams(PutFilesIdNumberAddSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFilesIdNumberAddSharedLinkQueryParams queryParams;
    public PutFilesIdNumberAddSharedLinkRequest withQueryParams(PutFilesIdNumberAddSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFilesIdNumberAddSharedLinkRequestBody request;
    public PutFilesIdNumberAddSharedLinkRequest withRequest(PutFilesIdNumberAddSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}