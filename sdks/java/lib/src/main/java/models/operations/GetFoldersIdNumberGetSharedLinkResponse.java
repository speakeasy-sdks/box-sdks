package .models.operations;



public class GetFoldersIdNumberGetSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersIdNumberGetSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFoldersIdNumberGetSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public GetFoldersIdNumberGetSharedLinkResponse withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public GetFoldersIdNumberGetSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}