package .models.operations;



public class PutFilesIdNumberUpdateSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public PutFilesIdNumberUpdateSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesIdNumberUpdateSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.File file;
    public PutFilesIdNumberUpdateSharedLinkResponse withFile(.models.shared.File file) {
        this.file = file;
        return this;
    }
    public Long statusCode;
    public PutFilesIdNumberUpdateSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}