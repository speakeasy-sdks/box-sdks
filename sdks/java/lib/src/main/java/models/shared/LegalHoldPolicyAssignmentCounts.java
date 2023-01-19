package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * LegalHoldPolicyAssignmentCounts
 * Counts of assignments within this a legal hold policy by item type
**/
public class LegalHoldPolicyAssignmentCounts {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public Long file;
    public LegalHoldPolicyAssignmentCounts withFile(Long file) {
        this.file = file;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_version")
    public Long fileVersion;
    public LegalHoldPolicyAssignmentCounts withFileVersion(Long fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder")
    public Long folder;
    public LegalHoldPolicyAssignmentCounts withFolder(Long folder) {
        this.folder = folder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public Long user;
    public LegalHoldPolicyAssignmentCounts withUser(Long user) {
        this.user = user;
        return this;
    }
}