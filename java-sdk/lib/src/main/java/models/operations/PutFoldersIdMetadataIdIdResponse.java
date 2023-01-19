package .models.operations;



public class PutFoldersIdMetadataIdIdResponse {
    public .models.shared.ClientError clientError;
    public PutFoldersIdMetadataIdIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFoldersIdMetadataIdIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Metadata metadata;
    public PutFoldersIdMetadataIdIdResponse withMetadata(.models.shared.Metadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public Long statusCode;
    public PutFoldersIdMetadataIdIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}