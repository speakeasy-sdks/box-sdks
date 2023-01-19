package .models.operations;



public class GetCollaborationsResponse {
    public .models.shared.ClientError clientError;
    public GetCollaborationsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Collaborations collaborations;
    public GetCollaborationsResponse withCollaborations(.models.shared.Collaborations collaborations) {
        this.collaborations = collaborations;
        return this;
    }
    public String contentType;
    public GetCollaborationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetCollaborationsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}