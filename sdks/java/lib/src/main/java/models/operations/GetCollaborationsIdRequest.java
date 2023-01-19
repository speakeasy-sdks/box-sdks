package .models.operations;



public class GetCollaborationsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetCollaborationsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetCollaborationsIdPathParams pathParams;
    public GetCollaborationsIdRequest withPathParams(GetCollaborationsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetCollaborationsIdQueryParams queryParams;
    public GetCollaborationsIdRequest withQueryParams(GetCollaborationsIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}