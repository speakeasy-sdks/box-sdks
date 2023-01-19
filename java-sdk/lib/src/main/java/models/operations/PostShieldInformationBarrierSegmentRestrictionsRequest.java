package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostShieldInformationBarrierSegmentRestrictionsRequest {
    public .models.utils.RetryConfig retries;
    public PostShieldInformationBarrierSegmentRestrictionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostShieldInformationBarrierSegmentRestrictionsRequestBody request;
    public PostShieldInformationBarrierSegmentRestrictionsRequest withRequest(PostShieldInformationBarrierSegmentRestrictionsRequestBody request) {
        this.request = request;
        return this;
    }
}