package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesUploadSessionsIdCommitRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesUploadSessionsIdCommitRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public String serverURL;
    public PostFilesUploadSessionsIdCommitRequest withServerUrl(String serverURL) {
        this.serverURL = serverURL;
        return this;
    }
    public PostFilesUploadSessionsIdCommitPathParams pathParams;
    public PostFilesUploadSessionsIdCommitRequest withPathParams(PostFilesUploadSessionsIdCommitPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PostFilesUploadSessionsIdCommitHeaders headers;
    public PostFilesUploadSessionsIdCommitRequest withHeaders(PostFilesUploadSessionsIdCommitHeaders headers) {
        this.headers = headers;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFilesUploadSessionsIdCommitRequestBody request;
    public PostFilesUploadSessionsIdCommitRequest withRequest(PostFilesUploadSessionsIdCommitRequestBody request) {
        this.request = request;
        return this;
    }
}