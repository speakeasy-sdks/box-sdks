package .models.operations;



public class GetFolderLocksResponse {
    public .models.shared.ClientError clientError;
    public GetFolderLocksResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFolderLocksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FolderLocks folderLocks;
    public GetFolderLocksResponse withFolderLocks(.models.shared.FolderLocks folderLocks) {
        this.folderLocks = folderLocks;
        return this;
    }
    public Long statusCode;
    public GetFolderLocksResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}