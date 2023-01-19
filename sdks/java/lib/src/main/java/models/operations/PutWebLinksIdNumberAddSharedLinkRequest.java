package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdNumberAddSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutWebLinksIdNumberAddSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutWebLinksIdNumberAddSharedLinkPathParams pathParams;
    public PutWebLinksIdNumberAddSharedLinkRequest withPathParams(PutWebLinksIdNumberAddSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutWebLinksIdNumberAddSharedLinkQueryParams queryParams;
    public PutWebLinksIdNumberAddSharedLinkRequest withQueryParams(PutWebLinksIdNumberAddSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutWebLinksIdNumberAddSharedLinkRequestBody request;
    public PutWebLinksIdNumberAddSharedLinkRequest withRequest(PutWebLinksIdNumberAddSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}