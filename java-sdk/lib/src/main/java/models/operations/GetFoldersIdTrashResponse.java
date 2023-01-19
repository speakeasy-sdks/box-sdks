package .models.operations;



public class GetFoldersIdTrashResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersIdTrashResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFoldersIdTrashResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFoldersIdTrashResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TrashFolder trashFolder;
    public GetFoldersIdTrashResponse withTrashFolder(.models.shared.TrashFolder trashFolder) {
        this.trashFolder = trashFolder;
        return this;
    }
}