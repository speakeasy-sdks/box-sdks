package .models.operations;



public class GetFilesIdMetadataGlobalBoxSkillsCardsResponse {
    public .models.shared.ClientError clientError;
    public GetFilesIdMetadataGlobalBoxSkillsCardsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetFilesIdMetadataGlobalBoxSkillsCardsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.SkillCardsMetadata skillCardsMetadata;
    public GetFilesIdMetadataGlobalBoxSkillsCardsResponse withSkillCardsMetadata(.models.shared.SkillCardsMetadata skillCardsMetadata) {
        this.skillCardsMetadata = skillCardsMetadata;
        return this;
    }
    public Long statusCode;
    public GetFilesIdMetadataGlobalBoxSkillsCardsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}