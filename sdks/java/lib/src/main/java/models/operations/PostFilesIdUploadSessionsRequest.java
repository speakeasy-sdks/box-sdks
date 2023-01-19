package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdUploadSessionsRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesIdUploadSessionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PostFilesIdUploadSessionsRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public PostFilesIdUploadSessionsPathParams pathParams;
    public PostFilesIdUploadSessionsRequest withPathParams(PostFilesIdUploadSessionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFilesIdUploadSessionsRequestBody request;
    public PostFilesIdUploadSessionsRequest withRequest(PostFilesIdUploadSessionsRequestBody request) {
        this.request = request;
        return this;
    }
}