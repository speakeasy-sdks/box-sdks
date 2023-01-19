package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutSkillInvocationsIdRequestBody {
    @JsonProperty("file")
    public PutSkillInvocationsIdRequestBodyFile file;
    public PutSkillInvocationsIdRequestBody withFile(PutSkillInvocationsIdRequestBodyFile file) {
        this.file = file;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_version")
    public PutSkillInvocationsIdRequestBodyFileVersion fileVersion;
    public PutSkillInvocationsIdRequestBody withFileVersion(PutSkillInvocationsIdRequestBodyFileVersion fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    @JsonProperty("metadata")
    public PutSkillInvocationsIdRequestBodyMetadata metadata;
    public PutSkillInvocationsIdRequestBody withMetadata(PutSkillInvocationsIdRequestBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    @JsonProperty("status")
    public PutSkillInvocationsIdRequestBodyStatusEnum status;
    public PutSkillInvocationsIdRequestBody withStatus(PutSkillInvocationsIdRequestBodyStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("usage")
    public PutSkillInvocationsIdRequestBodyUsage usage;
    public PutSkillInvocationsIdRequestBody withUsage(PutSkillInvocationsIdRequestBodyUsage usage) {
        this.usage = usage;
        return this;
    }
}