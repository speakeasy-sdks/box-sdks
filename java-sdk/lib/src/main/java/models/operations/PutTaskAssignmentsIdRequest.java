package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutTaskAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutTaskAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutTaskAssignmentsIdPathParams pathParams;
    public PutTaskAssignmentsIdRequest withPathParams(PutTaskAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutTaskAssignmentsIdRequestBody request;
    public PutTaskAssignmentsIdRequest withRequest(PutTaskAssignmentsIdRequestBody request) {
        this.request = request;
        return this;
    }
}