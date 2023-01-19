package .models.operations;



public class GetFilesUploadSessionsIdResponse {
    public .models.shared.ClientError clientError;
    public GetFilesUploadSessionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesUploadSessionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFilesUploadSessionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.UploadSession uploadSession;
    public GetFilesUploadSessionsIdResponse withUploadSession(.models.shared.UploadSession uploadSession) {
        this.uploadSession = uploadSession;
        return this;
    }
}