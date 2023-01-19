package .models.operations;



public class PostShieldInformationBarriersResponse {
    public .models.shared.ClientError clientError;
    public PostShieldInformationBarriersResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostShieldInformationBarriersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrier shieldInformationBarrier;
    public PostShieldInformationBarriersResponse withShieldInformationBarrier(.models.shared.ShieldInformationBarrier shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
    public Long statusCode;
    public PostShieldInformationBarriersResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}