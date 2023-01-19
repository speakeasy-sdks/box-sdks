package .models.operations;



public class GetShieldInformationBarrierReportsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarrierReportsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarrierReportsIdPathParams pathParams;
    public GetShieldInformationBarrierReportsIdRequest withPathParams(GetShieldInformationBarrierReportsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}