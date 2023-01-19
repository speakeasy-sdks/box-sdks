package .models.operations;



public class GetSignRequestsRequest {
    public .models.utils.RetryConfig retries;
    public GetSignRequestsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetSignRequestsQueryParams queryParams;
    public GetSignRequestsRequest withQueryParams(GetSignRequestsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}