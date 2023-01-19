package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostMetadataTemplatesSchemaNumberClassificationsRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("copyInstanceOnItemCopy")
    public Boolean copyInstanceOnItemCopy;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBody withCopyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
        this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
        return this;
    }
    @JsonProperty("displayName")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum displayName;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBody withDisplayName(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields[] fields;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBody withFields(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields[] fields) {
        this.fields = fields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBody withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonProperty("scope")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum scope;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBody withScope(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("templateKey")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum templateKey;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBody withTemplateKey(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum templateKey) {
        this.templateKey = templateKey;
        return this;
    }
}