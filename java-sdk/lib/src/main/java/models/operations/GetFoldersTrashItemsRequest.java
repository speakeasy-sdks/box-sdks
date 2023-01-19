package .models.operations;



public class GetFoldersTrashItemsRequest {
    public .models.utils.RetryConfig retries;
    public GetFoldersTrashItemsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFoldersTrashItemsQueryParams queryParams;
    public GetFoldersTrashItemsRequest withQueryParams(GetFoldersTrashItemsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}