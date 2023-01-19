package .models.operations;



public class GetTermsOfServicesRequest {
    public .models.utils.RetryConfig retries;
    public GetTermsOfServicesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetTermsOfServicesQueryParams queryParams;
    public GetTermsOfServicesRequest withQueryParams(GetTermsOfServicesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}