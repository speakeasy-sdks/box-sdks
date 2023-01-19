package .models.operations;



public class GetShieldInformationBarrierSegmentMembersIdRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarrierSegmentMembersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarrierSegmentMembersIdPathParams pathParams;
    public GetShieldInformationBarrierSegmentMembersIdRequest withPathParams(GetShieldInformationBarrierSegmentMembersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}