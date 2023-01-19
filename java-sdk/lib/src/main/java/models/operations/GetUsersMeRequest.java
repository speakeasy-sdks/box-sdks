package .models.operations;



public class GetUsersMeRequest {
    public .models.utils.RetryConfig retries;
    public GetUsersMeRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetUsersMeQueryParams queryParams;
    public GetUsersMeRequest withQueryParams(GetUsersMeQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}