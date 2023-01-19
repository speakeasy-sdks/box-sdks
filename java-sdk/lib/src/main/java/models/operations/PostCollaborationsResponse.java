package .models.operations;



public class PostCollaborationsResponse {
    public .models.shared.ClientError clientError;
    public PostCollaborationsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Collaboration collaboration;
    public PostCollaborationsResponse withCollaboration(.models.shared.Collaboration collaboration) {
        this.collaboration = collaboration;
        return this;
    }
    public String contentType;
    public PostCollaborationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostCollaborationsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}