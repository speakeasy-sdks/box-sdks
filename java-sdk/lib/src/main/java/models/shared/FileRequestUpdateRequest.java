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
 * FileRequestUpdateRequest
 * The request body to update a file request.
**/
public class FileRequestUpdateRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public FileRequestUpdateRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;
    public FileRequestUpdateRequest withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_description_required")
    public Boolean isDescriptionRequired;
    public FileRequestUpdateRequest withIsDescriptionRequired(Boolean isDescriptionRequired) {
        this.isDescriptionRequired = isDescriptionRequired;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_email_required")
    public Boolean isEmailRequired;
    public FileRequestUpdateRequest withIsEmailRequired(Boolean isEmailRequired) {
        this.isEmailRequired = isEmailRequired;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public FileRequestUpdateRequestStatusEnum status;
    public FileRequestUpdateRequest withStatus(FileRequestUpdateRequestStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;
    public FileRequestUpdateRequest withTitle(String title) {
        this.title = title;
        return this;
    }
}