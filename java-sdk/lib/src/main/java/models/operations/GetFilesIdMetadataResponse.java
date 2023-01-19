package .models.operations;



public class GetFilesIdMetadataResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdMetadataResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Metadatas metadatas;
    public GetFilesIdMetadataResponse withMetadatas(.models.shared.Metadatas metadatas) {
        this.metadatas = metadatas;
        return this;
    }
    public Long statusCode;
    public GetFilesIdMetadataResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}