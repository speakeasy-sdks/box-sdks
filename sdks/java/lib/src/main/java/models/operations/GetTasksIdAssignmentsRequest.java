package .models.operations;



public class GetTasksIdAssignmentsRequest {
    public .models.utils.RetryConfig retries;
    public GetTasksIdAssignmentsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetTasksIdAssignmentsPathParams pathParams;
    public GetTasksIdAssignmentsRequest withPathParams(GetTasksIdAssignmentsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}