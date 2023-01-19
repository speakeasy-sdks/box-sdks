package .models.operations;



public class DeleteWebLinksIdTrashRequest {
    public .models.utils.RetryConfig retries;
    public DeleteWebLinksIdTrashRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteWebLinksIdTrashPathParams pathParams;
    public DeleteWebLinksIdTrashRequest withPathParams(DeleteWebLinksIdTrashPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}