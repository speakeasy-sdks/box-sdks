package .models.operations;



public class GetFilesIdVersionsResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdVersionsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdVersionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.FileVersions fileVersions;
    public GetFilesIdVersionsResponse withFileVersions(.models.shared.FileVersions fileVersions) {
        this.fileVersions = fileVersions;
        return this;
    }
    public Long statusCode;
    public GetFilesIdVersionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}