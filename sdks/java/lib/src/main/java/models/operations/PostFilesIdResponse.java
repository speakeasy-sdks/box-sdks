package .models.operations;



public class PostFilesIdResponse {
    public .models.shared.ClientError clientError;
    public PostFilesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostFilesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TrashFileRestored trashFileRestored;
    public PostFilesIdResponse withTrashFileRestored(.models.shared.TrashFileRestored trashFileRestored) {
        this.trashFileRestored = trashFileRestored;
        return this;
    }
}