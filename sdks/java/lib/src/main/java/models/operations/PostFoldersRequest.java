package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersRequest {
    public .models.utils.RetryConfig retries;
    public PostFoldersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFoldersQueryParams queryParams;
    public PostFoldersRequest withQueryParams(PostFoldersQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFoldersRequestBody request;
    public PostFoldersRequest withRequest(PostFoldersRequestBody request) {
        this.request = request;
        return this;
    }
}