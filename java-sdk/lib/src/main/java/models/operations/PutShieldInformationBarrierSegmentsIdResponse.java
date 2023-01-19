package .models.operations;



public class PutShieldInformationBarrierSegmentsIdResponse {
    public .models.shared.ClientError clientError;
    public PutShieldInformationBarrierSegmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutShieldInformationBarrierSegmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierSegment shieldInformationBarrierSegment;
    public PutShieldInformationBarrierSegmentsIdResponse withShieldInformationBarrierSegment(.models.shared.ShieldInformationBarrierSegment shieldInformationBarrierSegment) {
        this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
        return this;
    }
    public Long statusCode;
    public PutShieldInformationBarrierSegmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}