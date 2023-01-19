package .models.operations;



public class PutFoldersIdNumberAddSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutFoldersIdNumberAddSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFoldersIdNumberAddSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public PutFoldersIdNumberAddSharedLinkResponse withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public PutFoldersIdNumberAddSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}