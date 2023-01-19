package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutShieldInformationBarrierSegmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutShieldInformationBarrierSegmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutShieldInformationBarrierSegmentsIdPathParams pathParams;
    public PutShieldInformationBarrierSegmentsIdRequest withPathParams(PutShieldInformationBarrierSegmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutShieldInformationBarrierSegmentsIdRequestBody request;
    public PutShieldInformationBarrierSegmentsIdRequest withRequest(PutShieldInformationBarrierSegmentsIdRequestBody request) {
        this.request = request;
        return this;
    }
}