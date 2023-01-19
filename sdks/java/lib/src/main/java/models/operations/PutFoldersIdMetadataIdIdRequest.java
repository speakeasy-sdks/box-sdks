package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdMetadataIdIdRequest {
    public .models.utils.RetryConfig retries;
    public PutFoldersIdMetadataIdIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFoldersIdMetadataIdIdPathParams pathParams;
    public PutFoldersIdMetadataIdIdRequest withPathParams(PutFoldersIdMetadataIdIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation[] request;
    public PutFoldersIdMetadataIdIdRequest withRequest(PutFoldersIdMetadataIdIdAMetadataInstanceUpdateOperation[] request) {
        this.request = request;
        return this;
    }
}