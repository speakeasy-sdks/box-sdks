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
 * FolderSharedLink
 * The shared link for this folder. This will be
 * `null` if no shared link has been created for this
 * folder.
**/
public class FolderSharedLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public FolderSharedLinkAccessEnum access;
    public FolderSharedLink withAccess(FolderSharedLinkAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonProperty("download_count")
    public Long downloadCount;
    public FolderSharedLink withDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_url")
    public String downloadUrl;
    public FolderSharedLink withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    @JsonProperty("effective_access")
    public FolderSharedLinkEffectiveAccessEnum effectiveAccess;
    public FolderSharedLink withEffectiveAccess(FolderSharedLinkEffectiveAccessEnum effectiveAccess) {
        this.effectiveAccess = effectiveAccess;
        return this;
    }
    @JsonProperty("effective_permission")
    public FolderSharedLinkEffectivePermissionEnum effectivePermission;
    public FolderSharedLink withEffectivePermission(FolderSharedLinkEffectivePermissionEnum effectivePermission) {
        this.effectivePermission = effectivePermission;
        return this;
    }
    @JsonProperty("is_password_enabled")
    public Boolean isPasswordEnabled;
    public FolderSharedLink withIsPasswordEnabled(Boolean isPasswordEnabled) {
        this.isPasswordEnabled = isPasswordEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public FolderSharedLinkPermissions permissions;
    public FolderSharedLink withPermissions(FolderSharedLinkPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonProperty("preview_count")
    public Long previewCount;
    public FolderSharedLink withPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("unshared_at")
    public OffsetDateTime unsharedAt;
    public FolderSharedLink withUnsharedAt(OffsetDateTime unsharedAt) {
        this.unsharedAt = unsharedAt;
        return this;
    }
    @JsonProperty("url")
    public String url;
    public FolderSharedLink withUrl(String url) {
        this.url = url;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_name")
    public String vanityName;
    public FolderSharedLink withVanityName(String vanityName) {
        this.vanityName = vanityName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_url")
    public String vanityUrl;
    public FolderSharedLink withVanityUrl(String vanityUrl) {
        this.vanityUrl = vanityUrl;
        return this;
    }
}