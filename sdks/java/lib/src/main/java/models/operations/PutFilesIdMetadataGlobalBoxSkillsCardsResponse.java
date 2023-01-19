package .models.operations;



public class PutFilesIdMetadataGlobalBoxSkillsCardsResponse {
    public .models.shared.ClientError clientError;
    public PutFilesIdMetadataGlobalBoxSkillsCardsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PutFilesIdMetadataGlobalBoxSkillsCardsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SkillCardsMetadata skillCardsMetadata;
    public PutFilesIdMetadataGlobalBoxSkillsCardsResponse withSkillCardsMetadata(.models.shared.SkillCardsMetadata skillCardsMetadata) {
        this.skillCardsMetadata = skillCardsMetadata;
        return this;
    }
    public Long statusCode;
    public PutFilesIdMetadataGlobalBoxSkillsCardsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}