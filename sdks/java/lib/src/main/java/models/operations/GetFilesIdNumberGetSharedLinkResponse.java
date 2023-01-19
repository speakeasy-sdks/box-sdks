package .models.operations;



public class GetFilesIdNumberGetSharedLinkResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdNumberGetSharedLinkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdNumberGetSharedLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.File file;
    public GetFilesIdNumberGetSharedLinkResponse withFile(.models.shared.File file) {
        this.file = file;
        return this;
    }
    public Long statusCode;
    public GetFilesIdNumberGetSharedLinkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}