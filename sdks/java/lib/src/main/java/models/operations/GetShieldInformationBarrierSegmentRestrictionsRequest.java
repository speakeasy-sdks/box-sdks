package .models.operations;



public class GetShieldInformationBarrierSegmentRestrictionsRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarrierSegmentRestrictionsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarrierSegmentRestrictionsQueryParams queryParams;
    public GetShieldInformationBarrierSegmentRestrictionsRequest withQueryParams(GetShieldInformationBarrierSegmentRestrictionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}