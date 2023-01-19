package .models.operations;



public class GetFoldersIdMetadataIdIdResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersIdMetadataIdIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFoldersIdMetadataIdIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Metadata metadata;
    public GetFoldersIdMetadataIdIdResponse withMetadata(.models.shared.Metadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public Long statusCode;
    public GetFoldersIdMetadataIdIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}