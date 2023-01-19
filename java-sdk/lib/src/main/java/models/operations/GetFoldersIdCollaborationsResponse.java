package .models.operations;



public class GetFoldersIdCollaborationsResponse {
    public .models.shared.ClientError clientError;
    public GetFoldersIdCollaborationsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Collaborations collaborations;
    public GetFoldersIdCollaborationsResponse withCollaborations(.models.shared.Collaborations collaborations) {
        this.collaborations = collaborations;
        return this;
    }
    public String contentType;
    public GetFoldersIdCollaborationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFoldersIdCollaborationsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}