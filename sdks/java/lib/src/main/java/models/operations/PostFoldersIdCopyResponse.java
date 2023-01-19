package .models.operations;



public class PostFoldersIdCopyResponse {
    public .models.shared.ClientError clientError;
    public PostFoldersIdCopyResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFoldersIdCopyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public PostFoldersIdCopyResponse withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public PostFoldersIdCopyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}