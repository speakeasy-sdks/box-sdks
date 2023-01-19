package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostShieldInformationBarriersRequest {
    public .models.utils.RetryConfig retries;
    public PostShieldInformationBarriersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.ShieldInformationBarrier request;
    public PostShieldInformationBarriersRequest withRequest(.models.shared.ShieldInformationBarrier request) {
        this.request = request;
        return this;
    }
}