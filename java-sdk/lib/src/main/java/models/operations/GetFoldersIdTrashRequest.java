package .models.operations;



public class GetFoldersIdTrashRequest {
    public .models.utils.RetryConfig retries;
    public GetFoldersIdTrashRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFoldersIdTrashPathParams pathParams;
    public GetFoldersIdTrashRequest withPathParams(GetFoldersIdTrashPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetFoldersIdTrashQueryParams queryParams;
    public GetFoldersIdTrashRequest withQueryParams(GetFoldersIdTrashQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}