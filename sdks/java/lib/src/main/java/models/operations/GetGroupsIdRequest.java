package .models.operations;



public class GetGroupsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetGroupsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetGroupsIdPathParams pathParams;
    public GetGroupsIdRequest withPathParams(GetGroupsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetGroupsIdQueryParams queryParams;
    public GetGroupsIdRequest withQueryParams(GetGroupsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}