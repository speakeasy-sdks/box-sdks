package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification
 * Additional information about the classification.
**/
public class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classificationDefinition")
    public String classificationDefinition;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification withClassificationDefinition(String classificationDefinition) {
        this.classificationDefinition = classificationDefinition;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("colorID")
    public Double colorID;
    public PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification withColorId(Double colorID) {
        this.colorID = colorID;
        return this;
    }
}