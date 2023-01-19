package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody
 * A single classification to remove.
**/
public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody {
    @JsonProperty("enumOptionKey")
    public String enumOptionKey;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody withEnumOptionKey(String enumOptionKey) {
        this.enumOptionKey = enumOptionKey;
        return this;
    }
    @JsonProperty("fieldKey")
    public String fieldKey;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    @JsonProperty("op")
    public String op;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberDeleteRequestBody withOp(String op) {
        this.op = op;
        return this;
    }
}