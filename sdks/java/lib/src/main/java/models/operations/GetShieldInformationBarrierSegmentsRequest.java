package .models.operations;



public class GetShieldInformationBarrierSegmentsRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarrierSegmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarrierSegmentsQueryParams queryParams;
    public GetShieldInformationBarrierSegmentsRequest withQueryParams(GetShieldInformationBarrierSegmentsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}