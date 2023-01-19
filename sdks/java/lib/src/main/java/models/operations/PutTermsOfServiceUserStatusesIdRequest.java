package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutTermsOfServiceUserStatusesIdRequest {
    public .models.utils.RetryConfig retries;
    public PutTermsOfServiceUserStatusesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutTermsOfServiceUserStatusesIdPathParams pathParams;
    public PutTermsOfServiceUserStatusesIdRequest withPathParams(PutTermsOfServiceUserStatusesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutTermsOfServiceUserStatusesIdRequestBody request;
    public PutTermsOfServiceUserStatusesIdRequest withRequest(PutTermsOfServiceUserStatusesIdRequestBody request) {
        this.request = request;
        return this;
    }
}