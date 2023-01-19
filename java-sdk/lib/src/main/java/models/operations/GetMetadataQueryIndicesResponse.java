package .models.operations;



public class GetMetadataQueryIndicesResponse {
    public .models.shared.ClientError clientError;
    public GetMetadataQueryIndicesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataQueryIndicesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataQueryIndices metadataQueryIndices;
    public GetMetadataQueryIndicesResponse withMetadataQueryIndices(.models.shared.MetadataQueryIndices metadataQueryIndices) {
        this.metadataQueryIndices = metadataQueryIndices;
        return this;
    }
    public Long statusCode;
    public GetMetadataQueryIndicesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}