package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ClassificationTemplateFieldsOptionsStaticConfig
 * Additional information about the classification.
**/
public class ClassificationTemplateFieldsOptionsStaticConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classification")
    public ClassificationTemplateFieldsOptionsStaticConfigClassification classification;
    public ClassificationTemplateFieldsOptionsStaticConfig withClassification(ClassificationTemplateFieldsOptionsStaticConfigClassification classification) {
        this.classification = classification;
        return this;
    }
}