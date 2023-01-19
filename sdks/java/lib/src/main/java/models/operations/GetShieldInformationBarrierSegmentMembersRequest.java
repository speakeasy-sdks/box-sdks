package .models.operations;



public class GetShieldInformationBarrierSegmentMembersRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarrierSegmentMembersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarrierSegmentMembersQueryParams queryParams;
    public GetShieldInformationBarrierSegmentMembersRequest withQueryParams(GetShieldInformationBarrierSegmentMembersQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}