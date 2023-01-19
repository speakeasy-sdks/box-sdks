package .models.operations;



public class PostShieldInformationBarrierSegmentsResponse {
    public .models.shared.ClientError clientError;
    public PostShieldInformationBarrierSegmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostShieldInformationBarrierSegmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierSegment shieldInformationBarrierSegment;
    public PostShieldInformationBarrierSegmentsResponse withShieldInformationBarrierSegment(.models.shared.ShieldInformationBarrierSegment shieldInformationBarrierSegment) {
        this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
        return this;
    }
    public Long statusCode;
    public PostShieldInformationBarrierSegmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}