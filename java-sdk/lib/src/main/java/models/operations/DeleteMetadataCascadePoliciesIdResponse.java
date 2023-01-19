package .models.operations;



public class DeleteMetadataCascadePoliciesIdResponse {
    public .models.shared.ClientError clientError;
    public DeleteMetadataCascadePoliciesIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteMetadataCascadePoliciesIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteMetadataCascadePoliciesIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}