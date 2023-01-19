package .models.operations;



public class GetFilesIdCommentsRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdCommentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdCommentsPathParams pathParams;
    public GetFilesIdCommentsRequest withPathParams(GetFilesIdCommentsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdCommentsQueryParams queryParams;
    public GetFilesIdCommentsRequest withQueryParams(GetFilesIdCommentsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}