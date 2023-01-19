package .models.operations;



public class PostMetadataCascadePoliciesResponse {
    public .models.shared.ClientError clientError;
    public PostMetadataCascadePoliciesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.ConflictError conflictError;
    public PostMetadataCascadePoliciesResponse withConflictError(.models.shared.ConflictError conflictError) {
        this.conflictError = conflictError;
        return this;
    }
    public String contentType;
    public PostMetadataCascadePoliciesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.MetadataCascadePolicy metadataCascadePolicy;
    public PostMetadataCascadePoliciesResponse withMetadataCascadePolicy(.models.shared.MetadataCascadePolicy metadataCascadePolicy) {
        this.metadataCascadePolicy = metadataCascadePolicy;
        return this;
    }
    public Long statusCode;
    public PostMetadataCascadePoliciesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}