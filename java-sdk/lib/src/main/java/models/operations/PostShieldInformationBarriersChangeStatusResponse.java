package .models.operations;



public class PostShieldInformationBarriersChangeStatusResponse {
    public .models.shared.ClientError clientError;
    public PostShieldInformationBarriersChangeStatusResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostShieldInformationBarriersChangeStatusResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.ShieldInformationBarrier shieldInformationBarrier;
    public PostShieldInformationBarriersChangeStatusResponse withShieldInformationBarrier(.models.shared.ShieldInformationBarrier shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
    public Long statusCode;
    public PostShieldInformationBarriersChangeStatusResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}