package .models.operations;



public class GetShieldInformationBarriersIdRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarriersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarriersIdPathParams pathParams;
    public GetShieldInformationBarriersIdRequest withPathParams(GetShieldInformationBarriersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}