package .models.operations;



public class PostFilesIdMetadataGlobalBoxSkillsCardsResponse {
    public .models.shared.ClientError clientError;
    public PostFilesIdMetadataGlobalBoxSkillsCardsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostFilesIdMetadataGlobalBoxSkillsCardsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SkillCardsMetadata skillCardsMetadata;
    public PostFilesIdMetadataGlobalBoxSkillsCardsResponse withSkillCardsMetadata(.models.shared.SkillCardsMetadata skillCardsMetadata) {
        this.skillCardsMetadata = skillCardsMetadata;
        return this;
    }
    public Long statusCode;
    public PostFilesIdMetadataGlobalBoxSkillsCardsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}