package .models.operations;



public class GetEnterprisesIdDevicePinnersResponse {
    public .models.shared.ClientError clientError;
    public GetEnterprisesIdDevicePinnersResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetEnterprisesIdDevicePinnersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.DevicePinners devicePinners;
    public GetEnterprisesIdDevicePinnersResponse withDevicePinners(.models.shared.DevicePinners devicePinners) {
        this.devicePinners = devicePinners;
        return this;
    }
    public Long statusCode;
    public GetEnterprisesIdDevicePinnersResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}