package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutLegalHoldPoliciesIdRequest {
    public .models.utils.RetryConfig retries;
    public PutLegalHoldPoliciesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutLegalHoldPoliciesIdPathParams pathParams;
    public PutLegalHoldPoliciesIdRequest withPathParams(PutLegalHoldPoliciesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutLegalHoldPoliciesIdRequestBody request;
    public PutLegalHoldPoliciesIdRequest withRequest(PutLegalHoldPoliciesIdRequestBody request) {
        this.request = request;
        return this;
    }
}