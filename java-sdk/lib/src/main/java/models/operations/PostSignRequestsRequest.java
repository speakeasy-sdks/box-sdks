package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostSignRequestsRequest {
    public .models.utils.RetryConfig retries;
    public PostSignRequestsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.SignRequestCreateRequest request;
    public PostSignRequestsRequest withRequest(.models.shared.SignRequestCreateRequest request) {
        this.request = request;
        return this;
    }
}