package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesContentRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesContentRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PostFilesContentRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public PostFilesContentQueryParams queryParams;
    public PostFilesContentRequest withQueryParams(PostFilesContentQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public PostFilesContentHeaders headers;
    public PostFilesContentRequest withHeaders(PostFilesContentHeaders headers) {
        this.headers = headers;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public PostFilesContentRequestBody request;
    public PostFilesContentRequest withRequest(PostFilesContentRequestBody request) {
        this.request = request;
        return this;
    }
}