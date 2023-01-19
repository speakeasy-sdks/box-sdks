package .models.operations;



public class GetShieldInformationBarrierSegmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarrierSegmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarrierSegmentsIdPathParams pathParams;
    public GetShieldInformationBarrierSegmentsIdRequest withPathParams(GetShieldInformationBarrierSegmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}