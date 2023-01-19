package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersIdCopyRequest {
    public .models.utils.RetryConfig retries;
    public PostFoldersIdCopyRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFoldersIdCopyPathParams pathParams;
    public PostFoldersIdCopyRequest withPathParams(PostFoldersIdCopyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PostFoldersIdCopyQueryParams queryParams;
    public PostFoldersIdCopyRequest withQueryParams(PostFoldersIdCopyQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFoldersIdCopyRequestBody request;
    public PostFoldersIdCopyRequest withRequest(PostFoldersIdCopyRequestBody request) {
        this.request = request;
        return this;
    }
}