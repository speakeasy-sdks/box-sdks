package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesUploadSessionsRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesUploadSessionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PostFilesUploadSessionsRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFilesUploadSessionsRequestBody request;
    public PostFilesUploadSessionsRequest withRequest(PostFilesUploadSessionsRequestBody request) {
        this.request = request;
        return this;
    }
}