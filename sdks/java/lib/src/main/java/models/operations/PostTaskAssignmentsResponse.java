package .models.operations;



public class PostTaskAssignmentsResponse {
    public .models.shared.ClientError clientError;
    public PostTaskAssignmentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostTaskAssignmentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostTaskAssignmentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TaskAssignment taskAssignment;
    public PostTaskAssignmentsResponse withTaskAssignment(.models.shared.TaskAssignment taskAssignment) {
        this.taskAssignment = taskAssignment;
        return this;
    }
}