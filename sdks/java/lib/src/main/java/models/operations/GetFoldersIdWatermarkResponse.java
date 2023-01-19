package .models.operations;



public class GetFoldersIdWatermarkResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersIdWatermarkResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFoldersIdWatermarkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFoldersIdWatermarkResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Watermark watermark;
    public GetFoldersIdWatermarkResponse withWatermark(.models.shared.Watermark watermark) {
        this.watermark = watermark;
        return this;
    }
}