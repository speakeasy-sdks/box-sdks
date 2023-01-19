package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdNumberRemoveSharedLinkRequest {
    public .models.utils.RetryConfig retries;
    public PutWebLinksIdNumberRemoveSharedLinkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutWebLinksIdNumberRemoveSharedLinkPathParams pathParams;
    public PutWebLinksIdNumberRemoveSharedLinkRequest withPathParams(PutWebLinksIdNumberRemoveSharedLinkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutWebLinksIdNumberRemoveSharedLinkQueryParams queryParams;
    public PutWebLinksIdNumberRemoveSharedLinkRequest withQueryParams(PutWebLinksIdNumberRemoveSharedLinkQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutWebLinksIdNumberRemoveSharedLinkRequestBody request;
    public PutWebLinksIdNumberRemoveSharedLinkRequest withRequest(PutWebLinksIdNumberRemoveSharedLinkRequestBody request) {
        this.request = request;
        return this;
    }
}