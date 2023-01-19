package .models.operations;



public class GetTaskAssignmentsIdResponse {
    public .models.shared.ClientError clientError;
    public GetTaskAssignmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetTaskAssignmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetTaskAssignmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TaskAssignment taskAssignment;
    public GetTaskAssignmentsIdResponse withTaskAssignment(.models.shared.TaskAssignment taskAssignment) {
        this.taskAssignment = taskAssignment;
        return this;
    }
}