package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody
 * The operation to perform on the classification
 * metadata template instance. In this case, it use
 * used to replace the value stored for the
 * `Box__Security__Classification__Key` field with a new
 * value.
**/
public class PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("op")
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyOpEnum op;
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody withOp(PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyOpEnum op) {
        this.op = op;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path")
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyPathEnum path;
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody withPath(PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyPathEnum path) {
        this.path = path;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;
    public PutFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody withValue(String value) {
        this.value = value;
        return this;
    }
}