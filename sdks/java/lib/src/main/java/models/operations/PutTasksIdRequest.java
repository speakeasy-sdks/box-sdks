package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutTasksIdRequest {
    public .models.utils.RetryConfig retries;
    public PutTasksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutTasksIdPathParams pathParams;
    public PutTasksIdRequest withPathParams(PutTasksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutTasksIdRequestBody request;
    public PutTasksIdRequest withRequest(PutTasksIdRequestBody request) {
        this.request = request;
        return this;
    }
}