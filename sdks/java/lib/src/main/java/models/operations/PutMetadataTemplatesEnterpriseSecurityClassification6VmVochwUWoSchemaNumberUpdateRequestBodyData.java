package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData
 * The details of the updated classification.
**/
public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("classification")
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification classification;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData withClassification(PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyDataClassification classification) {
        this.classification = classification;
        return this;
    }
    @JsonProperty("key")
    public String key;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData withKey(String key) {
        this.key = key;
        return this;
    }
}