package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification
 * Additional details for the classification.
**/
public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classificationDefinition")
    public String classificationDefinition;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification withClassificationDefinition(String classificationDefinition) {
        this.classificationDefinition = classificationDefinition;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("colorID")
    public Double colorID;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification withColorId(Double colorID) {
        this.colorID = colorID;
        return this;
    }
}