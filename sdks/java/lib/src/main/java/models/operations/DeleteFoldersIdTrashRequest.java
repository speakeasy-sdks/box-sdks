package .models.operations;



public class DeleteFoldersIdTrashRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFoldersIdTrashRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFoldersIdTrashPathParams pathParams;
    public DeleteFoldersIdTrashRequest withPathParams(DeleteFoldersIdTrashPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}