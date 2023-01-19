package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutCommentsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutCommentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutCommentsIdPathParams pathParams;
    public PutCommentsIdRequest withPathParams(PutCommentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public PutCommentsIdQueryParams queryParams;
    public PutCommentsIdRequest withQueryParams(PutCommentsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutCommentsIdRequestBody request;
    public PutCommentsIdRequest withRequest(PutCommentsIdRequestBody request) {
        this.request = request;
        return this;
    }
}