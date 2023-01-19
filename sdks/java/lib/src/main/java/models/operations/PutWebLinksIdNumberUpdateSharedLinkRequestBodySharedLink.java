package .models.operations;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink
 * The settings for the shared link to update.
**/
public class PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum access;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink withAccess(PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink withPassword(String password) {
        this.password = password;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions permissions;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink withPermissions(PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLinkPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("unshared_at")
    public OffsetDateTime unsharedAt;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink withUnsharedAt(OffsetDateTime unsharedAt) {
        this.unsharedAt = unsharedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_name")
    public String vanityName;
    public PutWebLinksIdNumberUpdateSharedLinkRequestBodySharedLink withVanityName(String vanityName) {
        this.vanityName = vanityName;
        return this;
    }
}