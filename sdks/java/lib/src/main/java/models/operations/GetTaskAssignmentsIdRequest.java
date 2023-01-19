package .models.operations;



public class GetTaskAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public GetTaskAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public GetTaskAssignmentsIdPathParams pathParams;
    public GetTaskAssignmentsIdRequest withPathParams(GetTaskAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}