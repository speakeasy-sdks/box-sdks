package .models.operations;



public class GetFilesIdCollaborationsResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdCollaborationsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public .models.shared.Collaborations collaborations;
    public GetFilesIdCollaborationsResponse withCollaborations(.models.shared.Collaborations collaborations) {
        this.collaborations = collaborations;
        return this;
    }
    public String contentType;
    public GetFilesIdCollaborationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetFilesIdCollaborationsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}