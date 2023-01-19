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
 * CollaborationAllowlistExemptTarget
 * The user that is exempt from any of the restrictions
 * imposed by the list of allowed collaboration domains for this enterprise.
**/
public class CollaborationAllowlistExemptTarget {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public CollaborationAllowlistExemptTarget withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enterprise")
    public CollaborationAllowlistExemptTargetEnterprise enterprise;
    public CollaborationAllowlistExemptTarget withEnterprise(CollaborationAllowlistExemptTargetEnterprise enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public CollaborationAllowlistExemptTarget withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("modified_at")
    public OffsetDateTime modifiedAt;
    public CollaborationAllowlistExemptTarget withModifiedAt(OffsetDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CollaborationAllowlistExemptTargetTypeEnum type;
    public CollaborationAllowlistExemptTarget withType(CollaborationAllowlistExemptTargetTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public CollaborationAllowlistExemptTargetEnterprise user;
    public CollaborationAllowlistExemptTarget withUser(CollaborationAllowlistExemptTargetEnterprise user) {
        this.user = user;
        return this;
    }
}