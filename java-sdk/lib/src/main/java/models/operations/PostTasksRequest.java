package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostTasksRequest {
    public .models.utils.RetryConfig retries;
    public PostTasksRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostTasksRequestBody request;
    public PostTasksRequest withRequest(PostTasksRequestBody request) {
        this.request = request;
        return this;
    }
}