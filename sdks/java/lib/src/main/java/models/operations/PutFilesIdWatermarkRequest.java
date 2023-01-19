package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdWatermarkRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdWatermarkRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdWatermarkPathParams pathParams;
    public PutFilesIdWatermarkRequest withPathParams(PutFilesIdWatermarkPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFilesIdWatermarkRequestBody request;
    public PutFilesIdWatermarkRequest withRequest(PutFilesIdWatermarkRequestBody request) {
        this.request = request;
        return this;
    }
}