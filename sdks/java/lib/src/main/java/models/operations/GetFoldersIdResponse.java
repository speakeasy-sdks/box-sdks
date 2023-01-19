package .models.operations;



public class GetFoldersIdResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFoldersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Folder folder;
    public GetFoldersIdResponse withFolder(.models.shared.Folder folder) {
        this.folder = folder;
        return this;
    }
    public Long statusCode;
    public GetFoldersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}