package .models.operations;



public class GetFilesIdVersionsIdResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdVersionsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdVersionsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersion fileVersion;
    public GetFilesIdVersionsIdResponse withFileVersion(.models.shared.FileVersion fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public Long statusCode;
    public GetFilesIdVersionsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}