package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields
 * The `enum` field which holds all the valid classification
 * values.
**/
public class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum displayName;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields withDisplayName(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum key;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields withKey(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions[] options;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields withOptions(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions[] options) {
        this.options = options;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum type;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields withType(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum type) {
        this.type = type;
        return this;
    }
}