package .models.operations;



public class PostFolderLocksResponse {
    public .models.shared.ClientError clientError;
    public PostFolderLocksResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFolderLocksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FolderLock folderLock;
    public PostFolderLocksResponse withFolderLock(.models.shared.FolderLock folderLock) {
        this.folderLock = folderLock;
        return this;
    }
    public Long statusCode;
    public PostFolderLocksResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}