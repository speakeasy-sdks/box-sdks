package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody
 * A single classification to update.
**/
public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody {
    @JsonProperty("data")
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData data;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody withData(PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBodyData data) {
        this.data = data;
        return this;
    }
    @JsonProperty("enumOptionKey")
    public String enumOptionKey;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody withEnumOptionKey(String enumOptionKey) {
        this.enumOptionKey = enumOptionKey;
        return this;
    }
    @JsonProperty("fieldKey")
    public String fieldKey;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    @JsonProperty("op")
    public String op;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberUpdateRequestBody withOp(String op) {
        this.op = op;
        return this;
    }
}