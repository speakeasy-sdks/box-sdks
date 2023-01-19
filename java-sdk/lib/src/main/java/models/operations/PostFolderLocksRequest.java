package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFolderLocksRequest {
    public .models.utils.RetryConfig retries;
    public PostFolderLocksRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFolderLocksRequestBody request;
    public PostFolderLocksRequest withRequest(PostFolderLocksRequestBody request) {
        this.request = request;
        return this;
    }
}