package .models.operations;



public class DeleteFilesIdTrashRequest {
    public .models.utils.RetryConfig retries;
    public DeleteFilesIdTrashRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteFilesIdTrashPathParams pathParams;
    public DeleteFilesIdTrashRequest withPathParams(DeleteFilesIdTrashPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}