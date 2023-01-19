package .models.operations;



public class PostTasksResponse {
    public .models.shared.ClientError clientError;
    public PostTasksResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostTasksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostTasksResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Task task;
    public PostTasksResponse withTask(.models.shared.Task task) {
        this.task = task;
        return this;
    }
}