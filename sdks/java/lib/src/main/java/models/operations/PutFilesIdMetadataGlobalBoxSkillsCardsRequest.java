package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdMetadataGlobalBoxSkillsCardsRequest {
    public .models.utils.RetryConfig retries;
    public PutFilesIdMetadataGlobalBoxSkillsCardsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutFilesIdMetadataGlobalBoxSkillsCardsPathParams pathParams;
    public PutFilesIdMetadataGlobalBoxSkillsCardsRequest withPathParams(PutFilesIdMetadataGlobalBoxSkillsCardsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json-patch+json")
    public PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody[] request;
    public PutFilesIdMetadataGlobalBoxSkillsCardsRequest withRequest(PutFilesIdMetadataGlobalBoxSkillsCardsRequestBody[] request) {
        this.request = request;
        return this;
    }
}