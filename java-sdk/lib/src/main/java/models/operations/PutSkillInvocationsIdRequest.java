package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutSkillInvocationsIdRequest {
    public .models.utils.RetryConfig retries;
    public PutSkillInvocationsIdRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
    public PutSkillInvocationsIdPathParams pathParams;
    public PutSkillInvocationsIdRequest withPathParams(PutSkillInvocationsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutSkillInvocationsIdRequestBody request;
    public PutSkillInvocationsIdRequest withRequest(PutSkillInvocationsIdRequestBody request) {
        this.request = request;
        return this;
    }
}