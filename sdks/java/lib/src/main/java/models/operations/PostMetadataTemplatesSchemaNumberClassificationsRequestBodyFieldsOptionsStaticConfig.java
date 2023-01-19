package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig
 * Additional information about the classification.
**/
public class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classification")
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification classification;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig withClassification(PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification classification) {
        this.classification = classification;
        return this;
    }
}