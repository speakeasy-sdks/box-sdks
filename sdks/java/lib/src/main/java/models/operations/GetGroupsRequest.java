package .models.operations;



public class GetGroupsRequest {
    public .models.utils.RetryConfig retries;
    public GetGroupsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetGroupsQueryParams queryParams;
    public GetGroupsRequest withQueryParams(GetGroupsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}