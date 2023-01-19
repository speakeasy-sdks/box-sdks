package .models.operations;



public class GetFilesIdThumbnailIdResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdThumbnailIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdThumbnailIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public java.util.Map<String, String[]> headers;
    public GetFilesIdThumbnailIdResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    public Long statusCode;
    public GetFilesIdThumbnailIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public byte[] getFilesIdThumbnailId200ImageJpgBinaryString;
    public GetFilesIdThumbnailIdResponse withGetFilesIdThumbnailId200ImageJpgBinaryString(byte[] getFilesIdThumbnailId200ImageJpgBinaryString) {
        this.getFilesIdThumbnailId200ImageJpgBinaryString = getFilesIdThumbnailId200ImageJpgBinaryString;
        return this;
    }
    public byte[] getFilesIdThumbnailId200ImagePngBinaryString;
    public GetFilesIdThumbnailIdResponse withGetFilesIdThumbnailId200ImagePngBinaryString(byte[] getFilesIdThumbnailId200ImagePngBinaryString) {
        this.getFilesIdThumbnailId200ImagePngBinaryString = getFilesIdThumbnailId200ImagePngBinaryString;
        return this;
    }
}