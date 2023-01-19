package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData
 * The details of the classification to add.
**/
public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classification")
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification classification;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData withClassification(PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyDataClassification classification) {
        this.classification = classification;
        return this;
    }
    @JsonProperty("key")
    public String key;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData withKey(String key) {
        this.key = key;
        return this;
    }
}