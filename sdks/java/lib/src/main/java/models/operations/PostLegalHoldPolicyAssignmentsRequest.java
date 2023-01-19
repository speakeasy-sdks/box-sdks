package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostLegalHoldPolicyAssignmentsRequest {
    public .models.utils.RetryConfig retries;
    public PostLegalHoldPolicyAssignmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostLegalHoldPolicyAssignmentsRequestBody request;
    public PostLegalHoldPolicyAssignmentsRequest withRequest(PostLegalHoldPolicyAssignmentsRequestBody request) {
        this.request = request;
        return this;
    }
}