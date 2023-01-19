package .models.operations;



public class GetTasksIdRequest {
    public .models.utils.RetryConfig retries;
    public GetTasksIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetTasksIdPathParams pathParams;
    public GetTasksIdRequest withPathParams(GetTasksIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}