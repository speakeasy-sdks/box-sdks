package .models.operations;



public class PutFoldersIdNumberRemoveSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutFoldersIdNumberRemoveSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFoldersIdNumberRemoveSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public PutFoldersIdNumberRemoveSharedLinkResponse withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public PutFoldersIdNumberRemoveSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}