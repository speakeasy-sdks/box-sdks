package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostMetadataCascadePoliciesIdApplyRequest {
    public .models.utils.RetryConfig retries;
    public PostMetadataCascadePoliciesIdApplyRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostMetadataCascadePoliciesIdApplyPathParams pathParams;
    public PostMetadataCascadePoliciesIdApplyRequest withPathParams(PostMetadataCascadePoliciesIdApplyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostMetadataCascadePoliciesIdApplyRequestBody request;
    public PostMetadataCascadePoliciesIdApplyRequest withRequest(PostMetadataCascadePoliciesIdApplyRequestBody request) {
        this.request = request;
        return this;
    }
}