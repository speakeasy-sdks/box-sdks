package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostMetadataTemplatesSchemaRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("copyInstanceOnItemCopy")
    public Boolean copyInstanceOnItemCopy;
    public PostMetadataTemplatesSchemaRequestBody withCopyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
        this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
        return this;
    }
    @JsonProperty("displayName")
    public String displayName;
    public PostMetadataTemplatesSchemaRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite[] fields;
    public PostMetadataTemplatesSchemaRequestBody withFields(PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite[] fields) {
        this.fields = fields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public PostMetadataTemplatesSchemaRequestBody withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonProperty("scope")
    public String scope;
    public PostMetadataTemplatesSchemaRequestBody withScope(String scope) {
        this.scope = scope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("templateKey")
    public String templateKey;
    public PostMetadataTemplatesSchemaRequestBody withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}