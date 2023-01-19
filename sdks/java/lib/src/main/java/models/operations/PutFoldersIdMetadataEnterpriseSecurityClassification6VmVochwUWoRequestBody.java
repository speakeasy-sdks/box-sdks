package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody
 * The operation to perform on the classification
 * metadata template instance. In this case, it use
 * used to replace the value stored for the
 * `Box__Security__Classification__Key` field with a new
 * value.
**/
public class PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("op")
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyOpEnum op;
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody withOp(PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyOpEnum op) {
        this.op = op;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("path")
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyPathEnum path;
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody withPath(PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBodyPathEnum path) {
        this.path = path;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String value;
    public PutFoldersIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody withValue(String value) {
        this.value = value;
        return this;
    }
}