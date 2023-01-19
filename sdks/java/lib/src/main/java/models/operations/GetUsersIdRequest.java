package .models.operations;



public class GetUsersIdRequest {
    public .models.utils.RetryConfig retries;
    public GetUsersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetUsersIdPathParams pathParams;
    public GetUsersIdRequest withPathParams(GetUsersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetUsersIdQueryParams queryParams;
    public GetUsersIdRequest withQueryParams(GetUsersIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}