package .models.operations;



public class PutCommentsIdResponse {
    public .models.shared.ClientError clientError;
    public PutCommentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Comment comment;
    public PutCommentsIdResponse withComment(.models.shared.Comment comment) {
        this.comment = comment;
        return this;
    }
    public String contentType;
    public PutCommentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutCommentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}