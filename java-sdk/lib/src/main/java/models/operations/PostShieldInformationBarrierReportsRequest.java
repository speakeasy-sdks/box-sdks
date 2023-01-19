package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostShieldInformationBarrierReportsRequest {
    public .models.utils.RetryConfig retries;
    public PostShieldInformationBarrierReportsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.ShieldInformationBarrierReference request;
    public PostShieldInformationBarrierReportsRequest withRequest(.models.shared.ShieldInformationBarrierReference request) {
        this.request = request;
        return this;
    }
}