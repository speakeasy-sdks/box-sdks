package .models.operations;



public class GetFilesIdCommentsResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdCommentsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Comments comments;
    public GetFilesIdCommentsResponse withComments(.models.shared.Comments comments) {
        this.comments = comments;
        return this;
    }
    public String contentType;
    public GetFilesIdCommentsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFilesIdCommentsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}