package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdMetadataIdIdRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesIdMetadataIdIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFilesIdMetadataIdIdPathParams pathParams;
    public PostFilesIdMetadataIdIdRequest withPathParams(PostFilesIdMetadataIdIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, String> request;
    public PostFilesIdMetadataIdIdRequest withRequest(java.util.Map<String, String> request) {
        this.request = request;
        return this;
    }
}