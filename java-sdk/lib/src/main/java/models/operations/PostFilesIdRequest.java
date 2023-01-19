package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFilesIdPathParams pathParams;
    public PostFilesIdRequest withPathParams(PostFilesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PostFilesIdQueryParams queryParams;
    public PostFilesIdRequest withQueryParams(PostFilesIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFilesIdRequestBody request;
    public PostFilesIdRequest withRequest(PostFilesIdRequestBody request) {
        this.request = request;
        return this;
    }
}