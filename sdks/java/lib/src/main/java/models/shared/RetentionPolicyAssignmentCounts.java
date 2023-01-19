package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RetentionPolicyAssignmentCounts
 * Counts the retention policy assignments for each item type.
**/
public class RetentionPolicyAssignmentCounts {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enterprise")
    public Long enterprise;
    public RetentionPolicyAssignmentCounts withEnterprise(Long enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder")
    public Long folder;
    public RetentionPolicyAssignmentCounts withFolder(Long folder) {
        this.folder = folder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata_template")
    public Long metadataTemplate;
    public RetentionPolicyAssignmentCounts withMetadataTemplate(Long metadataTemplate) {
        this.metadataTemplate = metadataTemplate;
        return this;
    }
}