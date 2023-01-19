package .models.operations;



public class GetSharedItemsNumberFoldersResponse {
    public .models.shared.ClientError clientError;
    public GetSharedItemsNumberFoldersResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetSharedItemsNumberFoldersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public GetSharedItemsNumberFoldersResponse withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public GetSharedItemsNumberFoldersResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}