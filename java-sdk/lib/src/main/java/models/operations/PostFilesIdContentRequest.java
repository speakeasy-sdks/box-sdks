package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdContentRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesIdContentRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PostFilesIdContentRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public PostFilesIdContentPathParams pathParams;
    public PostFilesIdContentRequest withPathParams(PostFilesIdContentPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PostFilesIdContentQueryParams queryParams;
    public PostFilesIdContentRequest withQueryParams(PostFilesIdContentQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public PostFilesIdContentHeaders headers;
    public PostFilesIdContentRequest withHeaders(PostFilesIdContentHeaders headers) {
        this.headers = headers;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public PostFilesIdContentRequestBody request;
    public PostFilesIdContentRequest withRequest(PostFilesIdContentRequestBody request) {
        this.request = request;
        return this;
    }
}