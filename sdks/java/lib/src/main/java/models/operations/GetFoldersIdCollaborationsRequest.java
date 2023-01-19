package .models.operations;



public class GetFoldersIdCollaborationsRequest {
    public .models.utils.RetryConfig retries;
    public GetFoldersIdCollaborationsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFoldersIdCollaborationsPathParams pathParams;
    public GetFoldersIdCollaborationsRequest withPathParams(GetFoldersIdCollaborationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFoldersIdCollaborationsQueryParams queryParams;
    public GetFoldersIdCollaborationsRequest withQueryParams(GetFoldersIdCollaborationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}