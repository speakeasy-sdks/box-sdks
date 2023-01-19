package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostRetentionPoliciesRequest {
    public .models.utils.RetryConfig retries;
    public PostRetentionPoliciesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostRetentionPoliciesRequestBody request;
    public PostRetentionPoliciesRequest withRequest(PostRetentionPoliciesRequestBody request) {
        this.request = request;
        return this;
    }
}