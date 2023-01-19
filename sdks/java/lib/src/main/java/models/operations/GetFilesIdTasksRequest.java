package .models.operations;



public class GetFilesIdTasksRequest {
    public .models.utils.RetryConfig retries;
    public GetFilesIdTasksRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetFilesIdTasksPathParams pathParams;
    public GetFilesIdTasksRequest withPathParams(GetFilesIdTasksPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}