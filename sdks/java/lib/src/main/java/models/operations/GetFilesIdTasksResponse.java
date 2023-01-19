package .models.operations;



public class GetFilesIdTasksResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdTasksResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdTasksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFilesIdTasksResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Tasks tasks;
    public GetFilesIdTasksResponse withTasks(.models.shared.Tasks tasks) {
        this.tasks = tasks;
        return this;
    }
}