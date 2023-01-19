package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdNumberUpdateSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutWebLinksIdNumberUpdateSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutWebLinksIdNumberUpdateSharedLinkPathParams pathParams;
    public PutWebLinksIdNumberUpdateSharedLinkRequest withPathParams(PutWebLinksIdNumberUpdateSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutWebLinksIdNumberUpdateSharedLinkQueryParams queryParams;
    public PutWebLinksIdNumberUpdateSharedLinkRequest withQueryParams(PutWebLinksIdNumberUpdateSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutWebLinksIdNumberUpdateSharedLinkRequestBody request;
    public PutWebLinksIdNumberUpdateSharedLinkRequest withRequest(PutWebLinksIdNumberUpdateSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}