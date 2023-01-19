package .models.operations;



public class GetCollaborationsIdResponse {
    public .models.shared.ClientError clientError;
    public GetCollaborationsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Collaboration collaboration;
    public GetCollaborationsIdResponse withCollaboration(.models.shared.Collaboration collaboration) {
        this.collaboration = collaboration;
        return this;
    }
    public String contentType;
    public GetCollaborationsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetCollaborationsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}