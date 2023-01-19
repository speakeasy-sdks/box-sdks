package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions
 * An individual classification.
**/
public class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions withKey(String key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("staticConfig")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig staticConfig;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions withStaticConfig(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig staticConfig) {
        this.staticConfig = staticConfig;
        return this;
    }
}