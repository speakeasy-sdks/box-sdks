package .models.operations;



public class PostShieldInformationBarrierSegmentMembersResponse {
    public .models.shared.ClientError clientError;
    public PostShieldInformationBarrierSegmentMembersResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostShieldInformationBarrierSegmentMembersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierSegmentMember shieldInformationBarrierSegmentMember;
    public PostShieldInformationBarrierSegmentMembersResponse withShieldInformationBarrierSegmentMember(.models.shared.ShieldInformationBarrierSegmentMember shieldInformationBarrierSegmentMember) {
        this.shieldInformationBarrierSegmentMember = shieldInformationBarrierSegmentMember;
        return this;
    }
    public Long statusCode;
    public PostShieldInformationBarrierSegmentMembersResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}