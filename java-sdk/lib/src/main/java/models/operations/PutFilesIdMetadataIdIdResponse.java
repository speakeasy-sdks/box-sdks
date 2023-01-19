package .models.operations;



public class PutFilesIdMetadataIdIdResponse {
    public .models.shared.ClientError clientError;
    public PutFilesIdMetadataIdIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesIdMetadataIdIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Metadata metadata;
    public PutFilesIdMetadataIdIdResponse withMetadata(.models.shared.Metadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public Long statusCode;
    public PutFilesIdMetadataIdIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}