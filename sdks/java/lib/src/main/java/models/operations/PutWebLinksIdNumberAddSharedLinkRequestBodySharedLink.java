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
 * PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink
 * The settings for the shared link to create on the web link.
 * 
 * Use an empty object (`{}`) to use the default settings for shared
 * links.
**/
public class PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum access;
    public PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink withAccess(PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink withPassword(String password) {
        this.password = password;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkPermissions permissions;
    public PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink withPermissions(PutWebLinksIdNumberAddSharedLinkRequestBodySharedLinkPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("unshared_at")
    public OffsetDateTime unsharedAt;
    public PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink withUnsharedAt(OffsetDateTime unsharedAt) {
        this.unsharedAt = unsharedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_name")
    public String vanityName;
    public PutWebLinksIdNumberAddSharedLinkRequestBodySharedLink withVanityName(String vanityName) {
        this.vanityName = vanityName;
        return this;
    }
}