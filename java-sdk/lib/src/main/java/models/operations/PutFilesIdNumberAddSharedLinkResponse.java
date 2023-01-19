package .models.operations;



public class PutFilesIdNumberAddSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutFilesIdNumberAddSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesIdNumberAddSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.File file;
    public PutFilesIdNumberAddSharedLinkResponse withFile(.models.shared.File file) {
        this.file = file;
        return this;
    }
    public Long statusCode;
    public PutFilesIdNumberAddSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}