package .models.operations;



public class GetFilesIdContentRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdContentRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdContentPathParams pathParams;
    public GetFilesIdContentRequest withPathParams(GetFilesIdContentPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdContentQueryParams queryParams;
    public GetFilesIdContentRequest withQueryParams(GetFilesIdContentQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public GetFilesIdContentHeaders headers;
    public GetFilesIdContentRequest withHeaders(GetFilesIdContentHeaders headers) {
        this.headers = headers;
        return this;
    }
}