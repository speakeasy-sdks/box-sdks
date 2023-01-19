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
 * Collaboration
 * Collaborations define access permissions for users and groups to files and
 * folders, similar to access control lists. A collaboration object grants a
 * user or group access to a file or folder with permissions defined by a
 * specific role.
**/
public class Collaboration {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("acceptance_requirements_status")
    public CollaborationAcceptanceRequirementsStatus acceptanceRequirementsStatus;
    public Collaboration withAcceptanceRequirementsStatus(CollaborationAcceptanceRequirementsStatus acceptanceRequirementsStatus) {
        this.acceptanceRequirementsStatus = acceptanceRequirementsStatus;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accessible_by")
    public UserMini accessibleBy;
    public Collaboration withAccessibleBy(UserMini accessibleBy) {
        this.accessibleBy = accessibleBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("acknowledged_at")
    public OffsetDateTime acknowledgedAt;
    public Collaboration withAcknowledgedAt(OffsetDateTime acknowledgedAt) {
        this.acknowledgedAt = acknowledgedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Collaboration withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public CollaborationUserBase createdBy;
    public Collaboration withCreatedBy(CollaborationUserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;
    public Collaboration withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public Collaboration withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invite_email")
    public String inviteEmail;
    public Collaboration withInviteEmail(String inviteEmail) {
        this.inviteEmail = inviteEmail;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    public java.util.Map<String, Object> item;
    public Collaboration withItem(java.util.Map<String, Object> item) {
        this.item = item;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public Collaboration withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public CollaborationRoleEnum role;
    public Collaboration withRole(CollaborationRoleEnum role) {
        this.role = role;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public CollaborationStatusEnum status;
    public Collaboration withStatus(CollaborationStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CollaborationTypeEnum type;
    public Collaboration withType(CollaborationTypeEnum type) {
        this.type = type;
        return this;
    }
}