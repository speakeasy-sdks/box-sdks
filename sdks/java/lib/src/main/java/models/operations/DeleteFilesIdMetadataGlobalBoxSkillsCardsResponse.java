package .models.operations;



public class DeleteFilesIdMetadataGlobalBoxSkillsCardsResponse {
    public .models.shared.ClientError clientError;
    public DeleteFilesIdMetadataGlobalBoxSkillsCardsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public DeleteFilesIdMetadataGlobalBoxSkillsCardsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteFilesIdMetadataGlobalBoxSkillsCardsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}