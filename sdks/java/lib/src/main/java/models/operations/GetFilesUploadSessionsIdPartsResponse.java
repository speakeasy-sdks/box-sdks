package .models.operations;



public class GetFilesUploadSessionsIdPartsResponse {
    public .models.shared.ClientError clientError;
    public GetFilesUploadSessionsIdPartsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesUploadSessionsIdPartsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFilesUploadSessionsIdPartsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.UploadParts uploadParts;
    public GetFilesUploadSessionsIdPartsResponse withUploadParts(.models.shared.UploadParts uploadParts) {
        this.uploadParts = uploadParts;
        return this;
    }
}