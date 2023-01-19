package .models.operations;



public class GetShieldInformationBarrierReportsRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarrierReportsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarrierReportsQueryParams queryParams;
    public GetShieldInformationBarrierReportsRequest withQueryParams(GetShieldInformationBarrierReportsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}