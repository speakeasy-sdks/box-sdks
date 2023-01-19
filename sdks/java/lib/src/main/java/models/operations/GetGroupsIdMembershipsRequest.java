package .models.operations;



public class GetGroupsIdMembershipsRequest {
    public .models.utils.RetryConfig retries;
    public GetGroupsIdMembershipsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetGroupsIdMembershipsPathParams pathParams;
    public GetGroupsIdMembershipsRequest withPathParams(GetGroupsIdMembershipsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetGroupsIdMembershipsQueryParams queryParams;
    public GetGroupsIdMembershipsRequest withQueryParams(GetGroupsIdMembershipsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}