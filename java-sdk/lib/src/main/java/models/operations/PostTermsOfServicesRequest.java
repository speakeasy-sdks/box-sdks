package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostTermsOfServicesRequest {
    public .models.utils.RetryConfig retries;
    public PostTermsOfServicesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostTermsOfServicesRequestBody request;
    public PostTermsOfServicesRequest withRequest(PostTermsOfServicesRequestBody request) {
        this.request = request;
        return this;
    }
}