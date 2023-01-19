package .models.operations;



public class PutTaskAssignmentsIdResponse {
    public .models.shared.ClientError clientError;
    public PutTaskAssignmentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutTaskAssignmentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutTaskAssignmentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TaskAssignment taskAssignment;
    public PutTaskAssignmentsIdResponse withTaskAssignment(.models.shared.TaskAssignment taskAssignment) {
        this.taskAssignment = taskAssignment;
        return this;
    }
}