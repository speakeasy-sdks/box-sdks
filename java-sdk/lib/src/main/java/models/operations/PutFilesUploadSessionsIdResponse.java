package .models.operations;



public class PutFilesUploadSessionsIdResponse {
    public .models.shared.ClientError clientError;
    public PutFilesUploadSessionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesUploadSessionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutFilesUploadSessionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.UploadedPart uploadedPart;
    public PutFilesUploadSessionsIdResponse withUploadedPart(.models.shared.UploadedPart uploadedPart) {
        this.uploadedPart = uploadedPart;
        return this;
    }
}