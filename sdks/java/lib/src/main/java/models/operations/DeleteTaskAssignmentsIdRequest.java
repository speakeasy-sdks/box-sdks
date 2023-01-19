package .models.operations;



public class DeleteTaskAssignmentsIdRequest {
    public .models.utils.RetryConfig retries;
    public DeleteTaskAssignmentsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public DeleteTaskAssignmentsIdPathParams pathParams;
    public DeleteTaskAssignmentsIdRequest withPathParams(DeleteTaskAssignmentsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}