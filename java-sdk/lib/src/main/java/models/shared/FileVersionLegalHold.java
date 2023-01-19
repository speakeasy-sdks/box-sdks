package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * FileVersionLegalHold
 * File-Version-Legal-Hold is an entity representing all
 * holds on a File Version.
**/
public class FileVersionLegalHold {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("deleted_at")
    public OffsetDateTime deletedAt;
    public FileVersionLegalHold withDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public FileMini file;
    public FileVersionLegalHold withFile(FileMini file) {
        this.file = file;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_version")
    public FileVersionMini fileVersion;
    public FileVersionLegalHold withFileVersion(FileVersionMini fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public FileVersionLegalHold withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legal_hold_policy_assignments")
    public LegalHoldPolicyAssignment[] legalHoldPolicyAssignments;
    public FileVersionLegalHold withLegalHoldPolicyAssignments(LegalHoldPolicyAssignment[] legalHoldPolicyAssignments) {
        this.legalHoldPolicyAssignments = legalHoldPolicyAssignments;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public FileVersionLegalHoldTypeEnum type;
    public FileVersionLegalHold withType(FileVersionLegalHoldTypeEnum type) {
        this.type = type;
        return this;
    }
}