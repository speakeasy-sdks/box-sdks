package .models.operations;



public class GetShieldInformationBarrierSegmentRestrictionsResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarrierSegmentRestrictionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarrierSegmentRestrictionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarrierSegmentRestrictionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetShieldInformationBarrierSegmentRestrictions200ApplicationJson getShieldInformationBarrierSegmentRestrictions200ApplicationJSONObject;
    public GetShieldInformationBarrierSegmentRestrictionsResponse withGetShieldInformationBarrierSegmentRestrictions200ApplicationJsonObject(GetShieldInformationBarrierSegmentRestrictions200ApplicationJson getShieldInformationBarrierSegmentRestrictions200ApplicationJSONObject) {
        this.getShieldInformationBarrierSegmentRestrictions200ApplicationJSONObject = getShieldInformationBarrierSegmentRestrictions200ApplicationJSONObject;
        return this;
    }
}