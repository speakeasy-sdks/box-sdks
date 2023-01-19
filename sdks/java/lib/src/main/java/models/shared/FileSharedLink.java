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
 * FileSharedLink
 * The shared link for this file. This will be
 * `null` if no shared link has been created for this
 * file.
**/
public class FileSharedLink {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public FileSharedLinkAccessEnum access;
    public FileSharedLink withAccess(FileSharedLinkAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonProperty("download_count")
    public Long downloadCount;
    public FileSharedLink withDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_url")
    public String downloadUrl;
    public FileSharedLink withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    @JsonProperty("effective_access")
    public FileSharedLinkEffectiveAccessEnum effectiveAccess;
    public FileSharedLink withEffectiveAccess(FileSharedLinkEffectiveAccessEnum effectiveAccess) {
        this.effectiveAccess = effectiveAccess;
        return this;
    }
    @JsonProperty("effective_permission")
    public FileSharedLinkEffectivePermissionEnum effectivePermission;
    public FileSharedLink withEffectivePermission(FileSharedLinkEffectivePermissionEnum effectivePermission) {
        this.effectivePermission = effectivePermission;
        return this;
    }
    @JsonProperty("is_password_enabled")
    public Boolean isPasswordEnabled;
    public FileSharedLink withIsPasswordEnabled(Boolean isPasswordEnabled) {
        this.isPasswordEnabled = isPasswordEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public FileSharedLinkPermissions permissions;
    public FileSharedLink withPermissions(FileSharedLinkPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonProperty("preview_count")
    public Long previewCount;
    public FileSharedLink withPreviewCount(Long previewCount) {
        this.previewCount = previewCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("unshared_at")
    public OffsetDateTime unsharedAt;
    public FileSharedLink withUnsharedAt(OffsetDateTime unsharedAt) {
        this.unsharedAt = unsharedAt;
        return this;
    }
    @JsonProperty("url")
    public String url;
    public FileSharedLink withUrl(String url) {
        this.url = url;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_name")
    public String vanityName;
    public FileSharedLink withVanityName(String vanityName) {
        this.vanityName = vanityName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vanity_url")
    public String vanityUrl;
    public FileSharedLink withVanityUrl(String vanityUrl) {
        this.vanityUrl = vanityUrl;
        return this;
    }
}