package .models.operations;



public class GetGroupMembershipsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetGroupMembershipsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetGroupMembershipsIdPathParams pathParams;
    public GetGroupMembershipsIdRequest withPathParams(GetGroupMembershipsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetGroupMembershipsIdQueryParams queryParams;
    public GetGroupMembershipsIdRequest withQueryParams(GetGroupMembershipsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}