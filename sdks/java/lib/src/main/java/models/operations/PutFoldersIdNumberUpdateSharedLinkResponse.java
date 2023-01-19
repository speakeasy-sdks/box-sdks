package .models.operations;



public class PutFoldersIdNumberUpdateSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutFoldersIdNumberUpdateSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFoldersIdNumberUpdateSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public PutFoldersIdNumberUpdateSharedLinkResponse withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public PutFoldersIdNumberUpdateSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}