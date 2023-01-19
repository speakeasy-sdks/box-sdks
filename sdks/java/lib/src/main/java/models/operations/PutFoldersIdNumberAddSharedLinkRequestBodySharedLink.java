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
 * PutFoldersIdNumberAddSharedLinkRequestBodySharedLink
 * The settings for the shared link to create on the folder.
 * 
 * Use an empty object (`{}`) to use the default settings for shared
 * links.
**/
public class PutFoldersIdNumberAddSharedLinkRequestBodySharedLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public PutFoldersIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum access;
    public PutFoldersIdNumberAddSharedLinkRequestBodySharedLink withAccess(PutFoldersIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public PutFoldersIdNumberAddSharedLinkRequestBodySharedLink withPassword(String password) {
        this.password = password;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public PutFoldersIdNumberAddSharedLinkRequestBodySharedLinkPermissions permissions;
    public PutFoldersIdNumberAddSharedLinkRequestBodySharedLink withPermissions(PutFoldersIdNumberAddSharedLinkRequestBodySharedLinkPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("unshared_at")
    public OffsetDateTime unsharedAt;
    public PutFoldersIdNumberAddSharedLinkRequestBodySharedLink withUnsharedAt(OffsetDateTime unsharedAt) {
        this.unsharedAt = unsharedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_name")
    public String vanityName;
    public PutFoldersIdNumberAddSharedLinkRequestBodySharedLink withVanityName(String vanityName) {
        this.vanityName = vanityName;
        return this;
    }
}