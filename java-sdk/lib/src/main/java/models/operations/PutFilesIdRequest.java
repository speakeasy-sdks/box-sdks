package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdPathParams pathParams;
    public PutFilesIdRequest withPathParams(PutFilesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutFilesIdQueryParams queryParams;
    public PutFilesIdRequest withQueryParams(PutFilesIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public PutFilesIdHeaders headers;
    public PutFilesIdRequest withHeaders(PutFilesIdHeaders headers) {
        this.headers = headers;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutFilesIdRequestBody request;
    public PutFilesIdRequest withRequest(PutFilesIdRequestBody request) {
        this.request = request;
        return this;
    }
}