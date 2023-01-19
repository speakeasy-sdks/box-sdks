package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification
 * Additional details for the classification.
**/
public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classificationDefinition")
    public String classificationDefinition;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification withClassificationDefinition(String classificationDefinition) {
        this.classificationDefinition = classificationDefinition;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("colorID")
    public Double colorID;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification withColorId(Double colorID) {
        this.colorID = colorID;
        return this;
    }
}