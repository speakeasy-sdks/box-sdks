package .models.operations;



public class GetShieldInformationBarrierReportsResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarrierReportsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarrierReportsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarrierReportsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetShieldInformationBarrierReports200ApplicationJson getShieldInformationBarrierReports200ApplicationJSONObject;
    public GetShieldInformationBarrierReportsResponse withGetShieldInformationBarrierReports200ApplicationJsonObject(GetShieldInformationBarrierReports200ApplicationJson getShieldInformationBarrierReports200ApplicationJSONObject) {
        this.getShieldInformationBarrierReports200ApplicationJSONObject = getShieldInformationBarrierReports200ApplicationJSONObject;
        return this;
    }
}