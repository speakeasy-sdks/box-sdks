package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutRetentionPoliciesIdRequest {
    public .models.utils.RetryConfig retries;
    public PutRetentionPoliciesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutRetentionPoliciesIdPathParams pathParams;
    public PutRetentionPoliciesIdRequest withPathParams(PutRetentionPoliciesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutRetentionPoliciesIdRequestBody request;
    public PutRetentionPoliciesIdRequest withRequest(PutRetentionPoliciesIdRequestBody request) {
        this.request = request;
        return this;
    }
}