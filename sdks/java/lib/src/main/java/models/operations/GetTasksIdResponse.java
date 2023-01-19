package .models.operations;



public class GetTasksIdResponse {
    public .models.shared.ClientError clientError;
    public GetTasksIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetTasksIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetTasksIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Task task;
    public GetTasksIdResponse withTask(.models.shared.Task task) {
        this.task = task;
        return this;
    }
}