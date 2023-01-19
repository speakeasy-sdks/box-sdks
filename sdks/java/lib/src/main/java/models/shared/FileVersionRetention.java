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
 * FileVersionRetention
 * A retention policy blocks permanent deletion of content
 * for a specified amount of time. Admins can apply policies to
 * specified folders, or an entire enterprise. A file version retention
 * is a  record for a retained file version. To use this feature,
 * you must  have the manage retention policies scope enabled for your
 * API key via  your application management console. For more information
 * about retention policies, please visit our help documentation
**/
public class FileVersionRetention {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("applied_at")
    public OffsetDateTime appliedAt;
    public FileVersionRetention withAppliedAt(OffsetDateTime appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("disposition_at")
    public OffsetDateTime dispositionAt;
    public FileVersionRetention withDispositionAt(OffsetDateTime dispositionAt) {
        this.dispositionAt = dispositionAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public FileMini file;
    public FileVersionRetention withFile(FileMini file) {
        this.file = file;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_version")
    public FileVersionMini fileVersion;
    public FileVersionRetention withFileVersion(FileVersionMini fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public FileVersionRetention withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public FileVersionRetentionTypeEnum type;
    public FileVersionRetention withType(FileVersionRetentionTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("winning_retention_policy")
    public RetentionPolicyMini winningRetentionPolicy;
    public FileVersionRetention withWinningRetentionPolicy(RetentionPolicyMini winningRetentionPolicy) {
        this.winningRetentionPolicy = winningRetentionPolicy;
        return this;
    }
}