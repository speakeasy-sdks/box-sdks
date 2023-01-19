package .models.operations;



public class DeleteFoldersIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFoldersIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFoldersIdPathParams pathParams;
    public DeleteFoldersIdRequest withPathParams(DeleteFoldersIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public DeleteFoldersIdQueryParams queryParams;
    public DeleteFoldersIdRequest withQueryParams(DeleteFoldersIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public DeleteFoldersIdHeaders headers;
    public DeleteFoldersIdRequest withHeaders(DeleteFoldersIdHeaders headers) {
        this.headers = headers;
        return this;
    }
}