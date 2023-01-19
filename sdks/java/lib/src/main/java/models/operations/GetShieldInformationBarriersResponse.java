package .models.operations;



public class GetShieldInformationBarriersResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarriersResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarriersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarriersResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public GetShieldInformationBarriers200ApplicationJson getShieldInformationBarriers200ApplicationJSONObject;
    public GetShieldInformationBarriersResponse withGetShieldInformationBarriers200ApplicationJsonObject(GetShieldInformationBarriers200ApplicationJson getShieldInformationBarriers200ApplicationJSONObject) {
        this.getShieldInformationBarriers200ApplicationJSONObject = getShieldInformationBarriers200ApplicationJSONObject;
        return this;
    }
}