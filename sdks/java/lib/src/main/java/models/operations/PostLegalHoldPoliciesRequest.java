package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostLegalHoldPoliciesRequest {
    public .models.utils.RetryConfig retries;
    public PostLegalHoldPoliciesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostLegalHoldPoliciesRequestBody request;
    public PostLegalHoldPoliciesRequest withRequest(PostLegalHoldPoliciesRequestBody request) {
        this.request = request;
        return this;
    }
}