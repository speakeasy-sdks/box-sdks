package .models.operations;



public class GetZipDownloadsIdStatusResponse {
    public .models.shared.ClientError clientError;
    public GetZipDownloadsIdStatusResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetZipDownloadsIdStatusResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetZipDownloadsIdStatusResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.ZipDownloadStatus zipDownloadStatus;
    public GetZipDownloadsIdStatusResponse withZipDownloadStatus(.models.shared.ZipDownloadStatus zipDownloadStatus) {
        this.zipDownloadStatus = zipDownloadStatus;
        return this;
    }
}