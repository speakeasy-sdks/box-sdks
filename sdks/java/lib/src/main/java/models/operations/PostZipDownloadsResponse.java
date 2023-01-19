package .models.operations;



public class PostZipDownloadsResponse {
    public .models.shared.ClientError clientError;
    public PostZipDownloadsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostZipDownloadsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostZipDownloadsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.ZipDownload zipDownload;
    public PostZipDownloadsResponse withZipDownload(.models.shared.ZipDownload zipDownload) {
        this.zipDownload = zipDownload;
        return this;
    }
}