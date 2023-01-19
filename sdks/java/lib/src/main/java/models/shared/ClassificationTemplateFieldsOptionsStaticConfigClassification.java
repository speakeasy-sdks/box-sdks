package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ClassificationTemplateFieldsOptionsStaticConfigClassification
 * Additional information about the classification.
 * 
 * This is not an exclusive list of properties, and
 * more object fields might be returned. These fields
 * are used for internal Box Shield and Box Governance
 * purposes and no additional value must be derived from
 * these fields.
**/
public class ClassificationTemplateFieldsOptionsStaticConfigClassification {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classificationDefinition")
    public String classificationDefinition;
    public ClassificationTemplateFieldsOptionsStaticConfigClassification withClassificationDefinition(String classificationDefinition) {
        this.classificationDefinition = classificationDefinition;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("colorID")
    public Double colorID;
    public ClassificationTemplateFieldsOptionsStaticConfigClassification withColorId(Double colorID) {
        this.colorID = colorID;
        return this;
    }
}