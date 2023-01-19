package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostTermsOfServiceUserStatusesRequest {
    public .models.utils.RetryConfig retries;
    public PostTermsOfServiceUserStatusesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostTermsOfServiceUserStatusesRequestBody request;
    public PostTermsOfServiceUserStatusesRequest withRequest(PostTermsOfServiceUserStatusesRequestBody request) {
        this.request = request;
        return this;
    }
}