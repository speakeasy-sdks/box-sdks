package .models.operations;



public class PostFilesIdVersionsCurrentResponse {
    public .models.shared.ClientError clientError;
    public PostFilesIdVersionsCurrentResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesIdVersionsCurrentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersion fileVersion;
    public PostFilesIdVersionsCurrentResponse withFileVersion(.models.shared.FileVersion fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public Long statusCode;
    public PostFilesIdVersionsCurrentResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}