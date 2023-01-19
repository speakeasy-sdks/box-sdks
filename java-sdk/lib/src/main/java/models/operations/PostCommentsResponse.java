package .models.operations;



public class PostCommentsResponse {
    public .models.shared.ClientError clientError;
    public PostCommentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Comment comment;
    public PostCommentsResponse withComment(.models.shared.Comment comment) {
        this.comment = comment;
        return this;
    }
    public String contentType;
    public PostCommentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostCommentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}