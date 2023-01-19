package .models.operations;



public class GetDevicePinnersIdResponse {
    public .models.shared.ClientError clientError;
    public GetDevicePinnersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetDevicePinnersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.DevicePinner devicePinner;
    public GetDevicePinnersIdResponse withDevicePinner(.models.shared.DevicePinner devicePinner) {
        this.devicePinner = devicePinner;
        return this;
    }
    public Long statusCode;
    public GetDevicePinnersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}