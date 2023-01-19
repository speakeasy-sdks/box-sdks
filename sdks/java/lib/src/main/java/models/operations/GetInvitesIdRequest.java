package .models.operations;



public class GetInvitesIdRequest {
    public .models.utils.RetryConfig retries;
    public GetInvitesIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetInvitesIdPathParams pathParams;
    public GetInvitesIdRequest withPathParams(GetInvitesIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetInvitesIdQueryParams queryParams;
    public GetInvitesIdRequest withQueryParams(GetInvitesIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}