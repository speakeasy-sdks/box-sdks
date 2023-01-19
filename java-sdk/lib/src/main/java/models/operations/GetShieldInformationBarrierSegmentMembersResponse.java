package .models.operations;



public class GetShieldInformationBarrierSegmentMembersResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarrierSegmentMembersResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarrierSegmentMembersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarrierSegmentMembersResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetShieldInformationBarrierSegmentMembers200ApplicationJson getShieldInformationBarrierSegmentMembers200ApplicationJSONObject;
    public GetShieldInformationBarrierSegmentMembersResponse withGetShieldInformationBarrierSegmentMembers200ApplicationJsonObject(GetShieldInformationBarrierSegmentMembers200ApplicationJson getShieldInformationBarrierSegmentMembers200ApplicationJSONObject) {
        this.getShieldInformationBarrierSegmentMembers200ApplicationJSONObject = getShieldInformationBarrierSegmentMembers200ApplicationJSONObject;
        return this;
    }
}