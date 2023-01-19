package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdVersionsCurrentRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesIdVersionsCurrentRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFilesIdVersionsCurrentPathParams pathParams;
    public PostFilesIdVersionsCurrentRequest withPathParams(PostFilesIdVersionsCurrentPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PostFilesIdVersionsCurrentQueryParams queryParams;
    public PostFilesIdVersionsCurrentRequest withQueryParams(PostFilesIdVersionsCurrentQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFilesIdVersionsCurrentRequestBody request;
    public PostFilesIdVersionsCurrentRequest withRequest(PostFilesIdVersionsCurrentRequestBody request) {
        this.request = request;
        return this;
    }
}