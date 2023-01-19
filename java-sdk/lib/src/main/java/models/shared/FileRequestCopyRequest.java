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
 * FileRequestCopyRequest
 * The request body to update a file request.
**/
public class FileRequestCopyRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public FileRequestCopyRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;
    public FileRequestCopyRequest withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    @JsonProperty("folder")
    public FileRequestCopyRequestFolder folder;
    public FileRequestCopyRequest withFolder(FileRequestCopyRequestFolder folder) {
        this.folder = folder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_description_required")
    public Boolean isDescriptionRequired;
    public FileRequestCopyRequest withIsDescriptionRequired(Boolean isDescriptionRequired) {
        this.isDescriptionRequired = isDescriptionRequired;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_email_required")
    public Boolean isEmailRequired;
    public FileRequestCopyRequest withIsEmailRequired(Boolean isEmailRequired) {
        this.isEmailRequired = isEmailRequired;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public FileRequestCopyRequestStatusEnum status;
    public FileRequestCopyRequest withStatus(FileRequestCopyRequestStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;
    public FileRequestCopyRequest withTitle(String title) {
        this.title = title;
        return this;
    }
}