package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdVersionsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdVersionsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdVersionsIdPathParams pathParams;
    public PutFilesIdVersionsIdRequest withPathParams(PutFilesIdVersionsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFilesIdVersionsIdRequestBody request;
    public PutFilesIdVersionsIdRequest withRequest(PutFilesIdVersionsIdRequestBody request) {
        this.request = request;
        return this;
    }
}