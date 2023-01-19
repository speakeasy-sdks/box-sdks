package .models.operations;



public class GetFilesIdTrashResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdTrashResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdTrashResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFilesIdTrashResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.TrashFile trashFile;
    public GetFilesIdTrashResponse withTrashFile(.models.shared.TrashFile trashFile) {
        this.trashFile = trashFile;
        return this;
    }
}