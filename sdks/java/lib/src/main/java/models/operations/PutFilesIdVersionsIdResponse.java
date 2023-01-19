package .models.operations;



public class PutFilesIdVersionsIdResponse {
    public .models.shared.ClientError clientError;
    public PutFilesIdVersionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesIdVersionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersion fileVersion;
    public PutFilesIdVersionsIdResponse withFileVersion(.models.shared.FileVersion fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public Long statusCode;
    public PutFilesIdVersionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}