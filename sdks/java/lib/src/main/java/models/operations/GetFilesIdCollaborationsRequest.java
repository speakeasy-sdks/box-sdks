package .models.operations;



public class GetFilesIdCollaborationsRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdCollaborationsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdCollaborationsPathParams pathParams;
    public GetFilesIdCollaborationsRequest withPathParams(GetFilesIdCollaborationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdCollaborationsQueryParams queryParams;
    public GetFilesIdCollaborationsRequest withQueryParams(GetFilesIdCollaborationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}