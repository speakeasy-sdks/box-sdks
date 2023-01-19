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
 * Invite
 * An invite for a user to an enterprise.
**/
public class Invite {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("actionable_by")
    public UserMini actionableBy;
    public Invite withActionableBy(UserMini actionableBy) {
        this.actionableBy = actionableBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Invite withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public Invite withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invited_by")
    public UserMini invitedBy;
    public Invite withInvitedBy(UserMini invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invited_to")
    public InviteEnterprise invitedTo;
    public Invite withInvitedTo(InviteEnterprise invitedTo) {
        this.invitedTo = invitedTo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public Invite withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public Invite withStatus(String status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public InviteTypeEnum type;
    public Invite withType(InviteTypeEnum type) {
        this.type = type;
        return this;
    }
}