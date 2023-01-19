package .models.operations;



public class GetShieldInformationBarrierSegmentsIdResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarrierSegmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarrierSegmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrierSegment shieldInformationBarrierSegment;
    public GetShieldInformationBarrierSegmentsIdResponse withShieldInformationBarrierSegment(.models.shared.ShieldInformationBarrierSegment shieldInformationBarrierSegment) {
        this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarrierSegmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}