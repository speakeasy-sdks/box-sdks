package .models.operations;



public class GetShieldInformationBarrierSegmentMembersIdResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarrierSegmentMembersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarrierSegmentMembersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierSegmentMember shieldInformationBarrierSegmentMember;
    public GetShieldInformationBarrierSegmentMembersIdResponse withShieldInformationBarrierSegmentMember(.models.shared.ShieldInformationBarrierSegmentMember shieldInformationBarrierSegmentMember) {
        this.shieldInformationBarrierSegmentMember = shieldInformationBarrierSegmentMember;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarrierSegmentMembersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}