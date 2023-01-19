package .models.operations;



public class GetEnterprisesIdDevicePinnersRequest {
    public .models.utils.RetryConfig retries;
    public GetEnterprisesIdDevicePinnersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetEnterprisesIdDevicePinnersPathParams pathParams;
    public GetEnterprisesIdDevicePinnersRequest withPathParams(GetEnterprisesIdDevicePinnersPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetEnterprisesIdDevicePinnersQueryParams queryParams;
    public GetEnterprisesIdDevicePinnersRequest withQueryParams(GetEnterprisesIdDevicePinnersQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}