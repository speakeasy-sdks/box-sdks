package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Box__Security__Classification__Key")
    public String boxSecurityClassificationKey;
    public PostFilesIdMetadataEnterpriseSecurityClassification6VmVochwUWoRequestBody withBoxSecurityClassificationKey(String boxSecurityClassificationKey) {
        this.boxSecurityClassificationKey = boxSecurityClassificationKey;
        return this;
    }
}