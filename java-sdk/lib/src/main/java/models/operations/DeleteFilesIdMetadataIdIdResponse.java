package .models.operations;



public class DeleteFilesIdMetadataIdIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteFilesIdMetadataIdIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFilesIdMetadataIdIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFilesIdMetadataIdIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}