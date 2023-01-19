package .models.operations;



public class DeleteWebLinksIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteWebLinksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteWebLinksIdPathParams pathParams;
    public DeleteWebLinksIdRequest withPathParams(DeleteWebLinksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}