package .models.operations;



public class PostFoldersIdResponse {
    public .models.shared.ClientError clientError;
    public PostFoldersIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFoldersIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostFoldersIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TrashFolderRestored trashFolderRestored;
    public PostFoldersIdResponse withTrashFolderRestored(.models.shared.TrashFolderRestored trashFolderRestored) {
        this.trashFolderRestored = trashFolderRestored;
        return this;
    }
}