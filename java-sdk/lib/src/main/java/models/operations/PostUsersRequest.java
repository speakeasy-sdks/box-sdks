package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostUsersRequest {
    public .models.utils.RetryConfig retries;
    public PostUsersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostUsersQueryParams queryParams;
    public PostUsersRequest withQueryParams(PostUsersQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostUsersRequestBody request;
    public PostUsersRequest withRequest(PostUsersRequestBody request) {
        this.request = request;
        return this;
    }
}