package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostWebLinksRequest {
    public .models.utils.RetryConfig retries;
    public PostWebLinksRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostWebLinksRequestBody request;
    public PostWebLinksRequest withRequest(PostWebLinksRequestBody request) {
        this.request = request;
        return this;
    }
}