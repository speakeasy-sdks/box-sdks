package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdCopyRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesIdCopyRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFilesIdCopyPathParams pathParams;
    public PostFilesIdCopyRequest withPathParams(PostFilesIdCopyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PostFilesIdCopyQueryParams queryParams;
    public PostFilesIdCopyRequest withQueryParams(PostFilesIdCopyQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFilesIdCopyRequestBody request;
    public PostFilesIdCopyRequest withRequest(PostFilesIdCopyRequestBody request) {
        this.request = request;
        return this;
    }
}