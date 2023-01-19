package .models.operations;



public class DeleteFoldersIdMetadataIdIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteFoldersIdMetadataIdIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFoldersIdMetadataIdIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFoldersIdMetadataIdIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}