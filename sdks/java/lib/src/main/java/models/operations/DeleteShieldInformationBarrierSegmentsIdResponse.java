package .models.operations;



public class DeleteShieldInformationBarrierSegmentsIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteShieldInformationBarrierSegmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteShieldInformationBarrierSegmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteShieldInformationBarrierSegmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}