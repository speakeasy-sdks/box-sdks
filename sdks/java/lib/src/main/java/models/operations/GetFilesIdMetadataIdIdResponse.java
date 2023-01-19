package .models.operations;



public class GetFilesIdMetadataIdIdResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdMetadataIdIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdMetadataIdIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Metadata metadata;
    public GetFilesIdMetadataIdIdResponse withMetadata(.models.shared.Metadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public Long statusCode;
    public GetFilesIdMetadataIdIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}