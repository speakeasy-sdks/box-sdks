package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdMetadataGlobalBoxSkillsCardsRequest {
    public .models.utils.RetryConfig retries;
    public PostFilesIdMetadataGlobalBoxSkillsCardsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PostFilesIdMetadataGlobalBoxSkillsCardsPathParams pathParams;
    public PostFilesIdMetadataGlobalBoxSkillsCardsRequest withPathParams(PostFilesIdMetadataGlobalBoxSkillsCardsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostFilesIdMetadataGlobalBoxSkillsCardsRequestBody request;
    public PostFilesIdMetadataGlobalBoxSkillsCardsRequest withRequest(PostFilesIdMetadataGlobalBoxSkillsCardsRequestBody request) {
        this.request = request;
        return this;
    }
}