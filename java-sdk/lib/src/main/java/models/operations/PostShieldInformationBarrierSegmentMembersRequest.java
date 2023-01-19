package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostShieldInformationBarrierSegmentMembersRequest {
    public .models.utils.RetryConfig retries;
    public PostShieldInformationBarrierSegmentMembersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostShieldInformationBarrierSegmentMembersRequestBody request;
    public PostShieldInformationBarrierSegmentMembersRequest withRequest(PostShieldInformationBarrierSegmentMembersRequestBody request) {
        this.request = request;
        return this;
    }
}