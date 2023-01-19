package .models.operations;



public class DeleteShieldInformationBarrierSegmentMembersIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteShieldInformationBarrierSegmentMembersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteShieldInformationBarrierSegmentMembersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteShieldInformationBarrierSegmentMembersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}