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
 * WebLinkSharedLink
 * The shared link object for this item. Will be
 * `null` if no shared link has been created.
**/
public class WebLinkSharedLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public WebLinkSharedLinkAccessEnum access;
    public WebLinkSharedLink withAccess(WebLinkSharedLinkAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonProperty("download_count")
    public Long downloadCount;
    public WebLinkSharedLink withDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_url")
    public String downloadUrl;
    public WebLinkSharedLink withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    @JsonProperty("effective_access")
    public WebLinkSharedLinkEffectiveAccessEnum effectiveAccess;
    public WebLinkSharedLink withEffectiveAccess(WebLinkSharedLinkEffectiveAccessEnum effectiveAccess) {
        this.effectiveAccess = effectiveAccess;
        return this;
    }
    @JsonProperty("effective_permission")
    public WebLinkSharedLinkEffectivePermissionEnum effectivePermission;
    public WebLinkSharedLink withEffectivePermission(WebLinkSharedLinkEffectivePermissionEnum effectivePermission) {
        this.effectivePermission = effectivePermission;
        return this;
    }
    @JsonProperty("is_password_enabled")
    public Boolean isPasswordEnabled;
    public WebLinkSharedLink withIsPasswordEnabled(Boolean isPasswordEnabled) {
        this.isPasswordEnabled = isPasswordEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public WebLinkSharedLinkPermissions permissions;
    public WebLinkSharedLink withPermissions(WebLinkSharedLinkPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonProperty("preview_count")
    public Long previewCount;
    public WebLinkSharedLink withPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("unshared_at")
    public OffsetDateTime unsharedAt;
    public WebLinkSharedLink withUnsharedAt(OffsetDateTime unsharedAt) {
        this.unsharedAt = unsharedAt;
        return this;
    }
    @JsonProperty("url")
    public String url;
    public WebLinkSharedLink withUrl(String url) {
        this.url = url;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_name")
    public String vanityName;
    public WebLinkSharedLink withVanityName(String vanityName) {
        this.vanityName = vanityName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_url")
    public String vanityUrl;
    public WebLinkSharedLink withVanityUrl(String vanityUrl) {
        this.vanityUrl = vanityUrl;
        return this;
    }
}