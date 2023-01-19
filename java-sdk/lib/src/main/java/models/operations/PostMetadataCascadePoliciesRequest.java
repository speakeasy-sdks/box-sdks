package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostMetadataCascadePoliciesRequest {
    public .models.utils.RetryConfig retries;
    public PostMetadataCascadePoliciesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostMetadataCascadePoliciesRequestBody request;
    public PostMetadataCascadePoliciesRequest withRequest(PostMetadataCascadePoliciesRequestBody request) {
        this.request = request;
        return this;
    }
}