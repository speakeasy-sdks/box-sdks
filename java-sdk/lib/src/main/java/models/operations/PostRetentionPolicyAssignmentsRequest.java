package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostRetentionPolicyAssignmentsRequest {
    public .models.utils.RetryConfig retries;
    public PostRetentionPolicyAssignmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostRetentionPolicyAssignmentsRequestBody request;
    public PostRetentionPolicyAssignmentsRequest withRequest(PostRetentionPolicyAssignmentsRequestBody request) {
        this.request = request;
        return this;
    }
}