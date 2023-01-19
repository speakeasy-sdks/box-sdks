package .models.operations;



public class GetGroupsIdCollaborationsRequest {
    public .models.utils.RetryConfig retries;
    public GetGroupsIdCollaborationsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetGroupsIdCollaborationsPathParams pathParams;
    public GetGroupsIdCollaborationsRequest withPathParams(GetGroupsIdCollaborationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetGroupsIdCollaborationsQueryParams queryParams;
    public GetGroupsIdCollaborationsRequest withQueryParams(GetGroupsIdCollaborationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}