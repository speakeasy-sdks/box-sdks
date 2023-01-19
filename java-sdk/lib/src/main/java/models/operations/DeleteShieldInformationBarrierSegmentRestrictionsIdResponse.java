package .models.operations;



public class DeleteShieldInformationBarrierSegmentRestrictionsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteShieldInformationBarrierSegmentRestrictionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteShieldInformationBarrierSegmentRestrictionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteShieldInformationBarrierSegmentRestrictionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}