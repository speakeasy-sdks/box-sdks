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
 * PutFilesIdNumberAddSharedLinkRequestBodySharedLink
 * The settings for the shared link to create on the file.
 * Use an empty object (`{}`) to use the default settings for shared
 * links.
**/
public class PutFilesIdNumberAddSharedLinkRequestBodySharedLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public PutFilesIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum access;
    public PutFilesIdNumberAddSharedLinkRequestBodySharedLink withAccess(PutFilesIdNumberAddSharedLinkRequestBodySharedLinkAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public PutFilesIdNumberAddSharedLinkRequestBodySharedLink withPassword(String password) {
        this.password = password;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public PutFilesIdNumberAddSharedLinkRequestBodySharedLinkPermissions permissions;
    public PutFilesIdNumberAddSharedLinkRequestBodySharedLink withPermissions(PutFilesIdNumberAddSharedLinkRequestBodySharedLinkPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("unshared_at")
    public OffsetDateTime unsharedAt;
    public PutFilesIdNumberAddSharedLinkRequestBodySharedLink withUnsharedAt(OffsetDateTime unsharedAt) {
        this.unsharedAt = unsharedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_name")
    public String vanityName;
    public PutFilesIdNumberAddSharedLinkRequestBodySharedLink withVanityName(String vanityName) {
        this.vanityName = vanityName;
        return this;
    }
}