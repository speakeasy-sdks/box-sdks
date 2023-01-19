package .models.operations;



public class GetFoldersIdMetadataResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersIdMetadataResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFoldersIdMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Metadatas metadatas;
    public GetFoldersIdMetadataResponse withMetadatas(.models.shared.Metadatas metadatas) {
        this.metadatas = metadatas;
        return this;
    }
    public Long statusCode;
    public GetFoldersIdMetadataResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}