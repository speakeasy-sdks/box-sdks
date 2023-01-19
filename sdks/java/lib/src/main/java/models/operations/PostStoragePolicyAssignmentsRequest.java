package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostStoragePolicyAssignmentsRequest {
    public .models.utils.RetryConfig retries;
    public PostStoragePolicyAssignmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostStoragePolicyAssignmentsRequestBody request;
    public PostStoragePolicyAssignmentsRequest withRequest(PostStoragePolicyAssignmentsRequestBody request) {
        this.request = request;
        return this;
    }
}