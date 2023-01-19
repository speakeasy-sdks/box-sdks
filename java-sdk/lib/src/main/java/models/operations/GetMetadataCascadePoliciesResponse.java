package .models.operations;



public class GetMetadataCascadePoliciesResponse {
    public .models.shared.ClientError clientError;
    public GetMetadataCascadePoliciesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetMetadataCascadePoliciesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataCascadePolicies metadataCascadePolicies;
    public GetMetadataCascadePoliciesResponse withMetadataCascadePolicies(.models.shared.MetadataCascadePolicies metadataCascadePolicies) {
        this.metadataCascadePolicies = metadataCascadePolicies;
        return this;
    }
    public Long statusCode;
    public GetMetadataCascadePoliciesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}