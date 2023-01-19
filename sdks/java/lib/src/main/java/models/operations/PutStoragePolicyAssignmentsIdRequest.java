package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutStoragePolicyAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutStoragePolicyAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutStoragePolicyAssignmentsIdPathParams pathParams;
    public PutStoragePolicyAssignmentsIdRequest withPathParams(PutStoragePolicyAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutStoragePolicyAssignmentsIdRequestBody request;
    public PutStoragePolicyAssignmentsIdRequest withRequest(PutStoragePolicyAssignmentsIdRequestBody request) {
        this.request = request;
        return this;
    }
}