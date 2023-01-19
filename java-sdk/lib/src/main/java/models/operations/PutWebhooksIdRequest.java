package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebhooksIdRequest {
    public .models.utils.RetryConfig retries;
    public PutWebhooksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutWebhooksIdPathParams pathParams;
    public PutWebhooksIdRequest withPathParams(PutWebhooksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutWebhooksIdRequestBody request;
    public PutWebhooksIdRequest withRequest(PutWebhooksIdRequestBody request) {
        this.request = request;
        return this;
    }
}