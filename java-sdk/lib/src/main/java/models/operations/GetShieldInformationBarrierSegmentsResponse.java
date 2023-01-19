package .models.operations;



public class GetShieldInformationBarrierSegmentsResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarrierSegmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarrierSegmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarrierSegmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetShieldInformationBarrierSegments200ApplicationJson getShieldInformationBarrierSegments200ApplicationJSONObject;
    public GetShieldInformationBarrierSegmentsResponse withGetShieldInformationBarrierSegments200ApplicationJsonObject(GetShieldInformationBarrierSegments200ApplicationJson getShieldInformationBarrierSegments200ApplicationJSONObject) {
        this.getShieldInformationBarrierSegments200ApplicationJSONObject = getShieldInformationBarrierSegments200ApplicationJSONObject;
        return this;
    }
}