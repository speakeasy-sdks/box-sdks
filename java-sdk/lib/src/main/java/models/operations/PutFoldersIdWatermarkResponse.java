package .models.operations;



public class PutFoldersIdWatermarkResponse {
    public .models.shared.ClientError clientError;
    public PutFoldersIdWatermarkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFoldersIdWatermarkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutFoldersIdWatermarkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Watermark watermark;
    public PutFoldersIdWatermarkResponse withWatermark(.models.shared.Watermark watermark) {
        this.watermark = watermark;
        return this;
    }
}