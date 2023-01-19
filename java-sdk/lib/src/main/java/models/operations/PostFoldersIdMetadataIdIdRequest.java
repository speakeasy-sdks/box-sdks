package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersIdMetadataIdIdRequest {
    public .models.utils.RetryConfig retries;
    public PostFoldersIdMetadataIdIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFoldersIdMetadataIdIdPathParams pathParams;
    public PostFoldersIdMetadataIdIdRequest withPathParams(PostFoldersIdMetadataIdIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, String> request;
    public PostFoldersIdMetadataIdIdRequest withRequest(java.util.Map<String, String> request) {
        this.request = request;
        return this;
    }
}