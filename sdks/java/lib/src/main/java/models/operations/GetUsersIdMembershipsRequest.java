package .models.operations;



public class GetUsersIdMembershipsRequest {
    public .models.utils.RetryConfig retries;
    public GetUsersIdMembershipsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetUsersIdMembershipsPathParams pathParams;
    public GetUsersIdMembershipsRequest withPathParams(GetUsersIdMembershipsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetUsersIdMembershipsQueryParams queryParams;
    public GetUsersIdMembershipsRequest withQueryParams(GetUsersIdMembershipsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}