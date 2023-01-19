package .models.operations;



public class GetTermsOfServiceUserStatusesRequest {
    public .models.utils.RetryConfig retries;
    public GetTermsOfServiceUserStatusesRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetTermsOfServiceUserStatusesQueryParams queryParams;
    public GetTermsOfServiceUserStatusesRequest withQueryParams(GetTermsOfServiceUserStatusesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}