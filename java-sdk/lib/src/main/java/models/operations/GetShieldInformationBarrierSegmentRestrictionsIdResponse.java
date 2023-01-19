package .models.operations;



public class GetShieldInformationBarrierSegmentRestrictionsIdResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarrierSegmentRestrictionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarrierSegmentRestrictionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierSegmentRestriction shieldInformationBarrierSegmentRestriction;
    public GetShieldInformationBarrierSegmentRestrictionsIdResponse withShieldInformationBarrierSegmentRestriction(.models.shared.ShieldInformationBarrierSegmentRestriction shieldInformationBarrierSegmentRestriction) {
        this.shieldInformationBarrierSegmentRestriction = shieldInformationBarrierSegmentRestriction;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarrierSegmentRestrictionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}