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
 * CollaborationAllowlistEntry
 * An entry that describes an approved domain for which users can collaborate
 * with files and folders in your enterprise or vice versa.
**/
public class CollaborationAllowlistEntry {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public CollaborationAllowlistEntry withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("direction")
    public CollaborationAllowlistEntryDirectionEnum direction;
    public CollaborationAllowlistEntry withDirection(CollaborationAllowlistEntryDirectionEnum direction) {
        this.direction = direction;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain")
    public String domain;
    public CollaborationAllowlistEntry withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enterprise")
    public CollaborationAllowlistEntryEnterprise enterprise;
    public CollaborationAllowlistEntry withEnterprise(CollaborationAllowlistEntryEnterprise enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public CollaborationAllowlistEntry withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CollaborationAllowlistEntryTypeEnum type;
    public CollaborationAllowlistEntry withType(CollaborationAllowlistEntryTypeEnum type) {
        this.type = type;
        return this;
    }
}