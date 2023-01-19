package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody
 * A single classification to add to the enterprise.
**/
public class PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody {
    @JsonProperty("data")
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData data;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody withData(PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBodyData data) {
        this.data = data;
        return this;
    }
    @JsonProperty("fieldKey")
    public String fieldKey;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    @JsonProperty("op")
    public String op;
    public PutMetadataTemplatesEnterpriseSecurityClassification6VmVochwUWoSchemaNumberAddRequestBody withOp(String op) {
        this.op = op;
        return this;
    }
}