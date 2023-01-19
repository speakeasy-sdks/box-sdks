package .models.operations;



public class DeleteTasksIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteTasksIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteTasksIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteTasksIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}