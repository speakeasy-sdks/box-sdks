package .models.operations;



public class GetUsersRequest {
    public .models.utils.RetryConfig retries;
    public GetUsersRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetUsersQueryParams queryParams;
    public GetUsersRequest withQueryParams(GetUsersQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}