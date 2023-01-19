package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdWatermarkRequest {
    public .models.utils.RetryConfig retries;
    public PutFoldersIdWatermarkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFoldersIdWatermarkPathParams pathParams;
    public PutFoldersIdWatermarkRequest withPathParams(PutFoldersIdWatermarkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFoldersIdWatermarkRequestBody request;
    public PutFoldersIdWatermarkRequest withRequest(PutFoldersIdWatermarkRequestBody request) {
        this.request = request;
        return this;
    }
}