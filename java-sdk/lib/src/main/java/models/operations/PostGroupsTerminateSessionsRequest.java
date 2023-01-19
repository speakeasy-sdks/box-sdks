package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostGroupsTerminateSessionsRequest {
    public .models.utils.RetryConfig retries;
    public PostGroupsTerminateSessionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostGroupsTerminateSessionsRequestBody request;
    public PostGroupsTerminateSessionsRequest withRequest(PostGroupsTerminateSessionsRequestBody request) {
        this.request = request;
        return this;
    }
}