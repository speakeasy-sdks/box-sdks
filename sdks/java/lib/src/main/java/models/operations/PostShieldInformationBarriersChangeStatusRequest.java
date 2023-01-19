package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostShieldInformationBarriersChangeStatusRequest {
    public .models.utils.RetryConfig retries;
    public PostShieldInformationBarriersChangeStatusRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostShieldInformationBarriersChangeStatusRequestBody request;
    public PostShieldInformationBarriersChangeStatusRequest withRequest(PostShieldInformationBarriersChangeStatusRequestBody request) {
        this.request = request;
        return this;
    }
}