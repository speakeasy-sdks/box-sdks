package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutTermsOfServicesIdRequest {
    public .models.utils.RetryConfig retries;
    public PutTermsOfServicesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutTermsOfServicesIdPathParams pathParams;
    public PutTermsOfServicesIdRequest withPathParams(PutTermsOfServicesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutTermsOfServicesIdRequestBody request;
    public PutTermsOfServicesIdRequest withRequest(PutTermsOfServicesIdRequestBody request) {
        this.request = request;
        return this;
    }
}