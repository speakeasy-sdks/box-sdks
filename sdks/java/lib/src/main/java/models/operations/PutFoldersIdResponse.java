package .models.operations;



public class PutFoldersIdResponse {
    public .models.shared.ClientError clientError;
    public PutFoldersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFoldersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public PutFoldersIdResponse withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public PutFoldersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}