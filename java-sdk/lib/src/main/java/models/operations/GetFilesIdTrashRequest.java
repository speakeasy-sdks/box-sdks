package .models.operations;



public class GetFilesIdTrashRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdTrashRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdTrashPathParams pathParams;
    public GetFilesIdTrashRequest withPathParams(GetFilesIdTrashPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFilesIdTrashQueryParams queryParams;
    public GetFilesIdTrashRequest withQueryParams(GetFilesIdTrashQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}