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
 * PutFilesIdRequestBodySharedLink
 * Defines a shared link for an item. Set this to `null` to remove
 * the shared link.
**/
public class PutFilesIdRequestBodySharedLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public PutFilesIdRequestBodySharedLinkAccessEnum access;
    public PutFilesIdRequestBodySharedLink withAccess(PutFilesIdRequestBodySharedLinkAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public PutFilesIdRequestBodySharedLink withPassword(String password) {
        this.password = password;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public PutFilesIdRequestBodySharedLinkPermissions permissions;
    public PutFilesIdRequestBodySharedLink withPermissions(PutFilesIdRequestBodySharedLinkPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("unshared_at")
    public OffsetDateTime unsharedAt;
    public PutFilesIdRequestBodySharedLink withUnsharedAt(OffsetDateTime unsharedAt) {
        this.unsharedAt = unsharedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_name")
    public String vanityName;
    public PutFilesIdRequestBodySharedLink withVanityName(String vanityName) {
        this.vanityName = vanityName;
        return this;
    }
}