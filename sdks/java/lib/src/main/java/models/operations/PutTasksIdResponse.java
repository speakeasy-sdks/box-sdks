package .models.operations;



public class PutTasksIdResponse {
    public .models.shared.ClientError clientError;
    public PutTasksIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutTasksIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutTasksIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Task task;
    public PutTasksIdResponse withTask(.models.shared.Task task) {
        this.task = task;
        return this;
    }
}