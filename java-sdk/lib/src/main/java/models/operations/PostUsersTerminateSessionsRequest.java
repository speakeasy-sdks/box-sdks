package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersTerminateSessionsRequest {
    public .models.utils.RetryConfig retries;
    public PostUsersTerminateSessionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostUsersTerminateSessionsRequestBody request;
    public PostUsersTerminateSessionsRequest withRequest(PostUsersTerminateSessionsRequestBody request) {
        this.request = request;
        return this;
    }
}