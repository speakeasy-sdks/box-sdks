package .models.operations;



public class GetTasksIdAssignmentsResponse {
    public .models.shared.ClientError clientError;
    public GetTasksIdAssignmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetTasksIdAssignmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetTasksIdAssignmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TaskAssignments taskAssignments;
    public GetTasksIdAssignmentsResponse withTaskAssignments(.models.shared.TaskAssignments taskAssignments) {
        this.taskAssignments = taskAssignments;
        return this;
    }
}