package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostTaskAssignmentsRequest {
    public .models.utils.RetryConfig retries;
    public PostTaskAssignmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostTaskAssignmentsRequestBody request;
    public PostTaskAssignmentsRequest withRequest(PostTaskAssignmentsRequestBody request) {
        this.request = request;
        return this;
    }
}