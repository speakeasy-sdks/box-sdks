package .models.operations;



public class DeleteDevicePinnersIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteDevicePinnersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteDevicePinnersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteDevicePinnersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}