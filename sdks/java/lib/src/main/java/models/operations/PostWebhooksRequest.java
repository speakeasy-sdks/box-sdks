package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostWebhooksRequest {
    public .models.utils.RetryConfig retries;
    public PostWebhooksRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostWebhooksRequestBody request;
    public PostWebhooksRequest withRequest(PostWebhooksRequestBody request) {
        this.request = request;
        return this;
    }
}