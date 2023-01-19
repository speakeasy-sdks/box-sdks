package .models.operations;



public class GetMetadataCascadePoliciesIdResponse {
    public .models.shared.ClientError clientError;
    public GetMetadataCascadePoliciesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataCascadePoliciesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataCascadePolicy metadataCascadePolicy;
    public GetMetadataCascadePoliciesIdResponse withMetadataCascadePolicy(.models.shared.MetadataCascadePolicy metadataCascadePolicy) {
        this.metadataCascadePolicy = metadataCascadePolicy;
        return this;
    }
    public Long statusCode;
    public GetMetadataCascadePoliciesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}