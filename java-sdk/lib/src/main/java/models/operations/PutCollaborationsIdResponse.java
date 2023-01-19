package .models.operations;



public class PutCollaborationsIdResponse {
    public .models.shared.ClientError clientError;
    public PutCollaborationsIdResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Collaboration collaboration;
    public PutCollaborationsIdResponse withCollaboration(.models.shared.Collaboration collaboration) {
        this.collaboration = collaboration;
        return this;
    }
    public String contentType;
    public PutCollaborationsIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PutCollaborationsIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}