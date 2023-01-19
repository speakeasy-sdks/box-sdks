package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdRequest {
    public .models.utils.RetryConfig retries;
    public PutWebLinksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutWebLinksIdPathParams pathParams;
    public PutWebLinksIdRequest withPathParams(PutWebLinksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutWebLinksIdRequestBody request;
    public PutWebLinksIdRequest withRequest(PutWebLinksIdRequestBody request) {
        this.request = request;
        return this;
    }
}