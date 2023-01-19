package .models.operations;



public class DeleteTasksIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteTasksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteTasksIdPathParams pathParams;
    public DeleteTasksIdRequest withPathParams(DeleteTasksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}