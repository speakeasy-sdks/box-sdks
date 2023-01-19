package .models.operations;



public class PostShieldInformationBarrierSegmentRestrictionsResponse {
    public .models.shared.ClientError clientError;
    public PostShieldInformationBarrierSegmentRestrictionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostShieldInformationBarrierSegmentRestrictionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierSegmentRestriction shieldInformationBarrierSegmentRestriction;
    public PostShieldInformationBarrierSegmentRestrictionsResponse withShieldInformationBarrierSegmentRestriction(.models.shared.ShieldInformationBarrierSegmentRestriction shieldInformationBarrierSegmentRestriction) {
        this.shieldInformationBarrierSegmentRestriction = shieldInformationBarrierSegmentRestriction;
        return this;
    }
    public Long statusCode;
    public PostShieldInformationBarrierSegmentRestrictionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}