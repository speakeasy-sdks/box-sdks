package .models.operations;



public class GetCommentsIdResponse {
    public .models.shared.ClientError clientError;
    public GetCommentsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Comment comment;
    public GetCommentsIdResponse withComment(.models.shared.Comment comment) {
        this.comment = comment;
        return this;
    }
    public String contentType;
    public GetCommentsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetCommentsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}