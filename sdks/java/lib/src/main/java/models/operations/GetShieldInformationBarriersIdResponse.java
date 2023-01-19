package .models.operations;



public class GetShieldInformationBarriersIdResponse {
    public .models.shared.ClientError clientError;
    public GetShieldInformationBarriersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetShieldInformationBarriersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrier shieldInformationBarrier;
    public GetShieldInformationBarriersIdResponse withShieldInformationBarrier(.models.shared.ShieldInformationBarrier shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
    public Long statusCode;
    public GetShieldInformationBarriersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}