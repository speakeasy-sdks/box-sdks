package .models.operations;



public class GetShieldInformationBarriersRequest {
    public .models.utils.RetryConfig retries;
    public GetShieldInformationBarriersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetShieldInformationBarriersQueryParams queryParams;
    public GetShieldInformationBarriersRequest withQueryParams(GetShieldInformationBarriersQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}