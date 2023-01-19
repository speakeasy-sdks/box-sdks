package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdMetadataIdIdRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdMetadataIdIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdMetadataIdIdPathParams pathParams;
    public PutFilesIdMetadataIdIdRequest withPathParams(PutFilesIdMetadataIdIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperation[] request;
    public PutFilesIdMetadataIdIdRequest withRequest(PutFilesIdMetadataIdIdAMetadataInstanceUpdateOperation[] request) {
        this.request = request;
        return this;
    }
}