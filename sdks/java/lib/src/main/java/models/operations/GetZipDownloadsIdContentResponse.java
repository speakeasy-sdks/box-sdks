package .models.operations;



public class GetZipDownloadsIdContentResponse {
    public .models.shared.ClientError clientError;
    public GetZipDownloadsIdContentResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetZipDownloadsIdContentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public java.util.Map<String, String[]> headers;
    public GetZipDownloadsIdContentResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    public Long statusCode;
    public GetZipDownloadsIdContentResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public byte[] getZipDownloadsIdContent200ApplicationOctetStreamBinaryString;
    public GetZipDownloadsIdContentResponse withGetZipDownloadsIdContent200ApplicationOctetStreamBinaryString(byte[] getZipDownloadsIdContent200ApplicationOctetStreamBinaryString) {
        this.getZipDownloadsIdContent200ApplicationOctetStreamBinaryString = getZipDownloadsIdContent200ApplicationOctetStreamBinaryString;
        return this;
    }
}