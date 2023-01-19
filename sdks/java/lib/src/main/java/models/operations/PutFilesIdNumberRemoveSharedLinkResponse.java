package .models.operations;



public class PutFilesIdNumberRemoveSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutFilesIdNumberRemoveSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesIdNumberRemoveSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.File file;
    public PutFilesIdNumberRemoveSharedLinkResponse withFile(.models.shared.File file) {
        this.file = file;
        return this;
    }
    public Long statusCode;
    public PutFilesIdNumberRemoveSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}