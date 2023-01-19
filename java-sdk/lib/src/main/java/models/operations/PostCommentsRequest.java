package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostCommentsRequest {
    public .models.utils.RetryConfig retries;
    public PostCommentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostCommentsQueryParams queryParams;
    public PostCommentsRequest withQueryParams(PostCommentsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostCommentsRequestBody request;
    public PostCommentsRequest withRequest(PostCommentsRequestBody request) {
        this.request = request;
        return this;
    }
}