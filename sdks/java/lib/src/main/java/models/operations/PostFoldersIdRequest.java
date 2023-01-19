package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersIdRequest {
    public .models.utils.RetryConfig retries;
    public PostFoldersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFoldersIdPathParams pathParams;
    public PostFoldersIdRequest withPathParams(PostFoldersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PostFoldersIdQueryParams queryParams;
    public PostFoldersIdRequest withQueryParams(PostFoldersIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFoldersIdRequestBody request;
    public PostFoldersIdRequest withRequest(PostFoldersIdRequestBody request) {
        this.request = request;
        return this;
    }
}