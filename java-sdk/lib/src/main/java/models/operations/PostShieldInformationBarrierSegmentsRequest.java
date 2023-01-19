package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostShieldInformationBarrierSegmentsRequest {
    public .models.utils.RetryConfig retries;
    public PostShieldInformationBarrierSegmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostShieldInformationBarrierSegmentsRequestBody request;
    public PostShieldInformationBarrierSegmentsRequest withRequest(PostShieldInformationBarrierSegmentsRequestBody request) {
        this.request = request;
        return this;
    }
}