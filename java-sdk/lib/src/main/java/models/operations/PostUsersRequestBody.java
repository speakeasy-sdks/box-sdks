package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostUsersRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public String address;
    public PostUsersRequestBody withAddress(String address) {
        this.address = address;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_see_managed_users")
    public Boolean canSeeManagedUsers;
    public PostUsersRequestBody withCanSeeManagedUsers(Boolean canSeeManagedUsers) {
        this.canSeeManagedUsers = canSeeManagedUsers;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_app_user_id")
    public String externalAppUserId;
    public PostUsersRequestBody withExternalAppUserId(String externalAppUserId) {
        this.externalAppUserId = externalAppUserId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_exempt_from_device_limits")
    public Boolean isExemptFromDeviceLimits;
    public PostUsersRequestBody withIsExemptFromDeviceLimits(Boolean isExemptFromDeviceLimits) {
        this.isExemptFromDeviceLimits = isExemptFromDeviceLimits;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_exempt_from_login_verification")
    public Boolean isExemptFromLoginVerification;
    public PostUsersRequestBody withIsExemptFromLoginVerification(Boolean isExemptFromLoginVerification) {
        this.isExemptFromLoginVerification = isExemptFromLoginVerification;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_external_collab_restricted")
    public Boolean isExternalCollabRestricted;
    public PostUsersRequestBody withIsExternalCollabRestricted(Boolean isExternalCollabRestricted) {
        this.isExternalCollabRestricted = isExternalCollabRestricted;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_platform_access_only")
    public Boolean isPlatformAccessOnly;
    public PostUsersRequestBody withIsPlatformAccessOnly(Boolean isPlatformAccessOnly) {
        this.isPlatformAccessOnly = isPlatformAccessOnly;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sync_enabled")
    public Boolean isSyncEnabled;
    public PostUsersRequestBody withIsSyncEnabled(Boolean isSyncEnabled) {
        this.isSyncEnabled = isSyncEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_title")
    public String jobTitle;
    public PostUsersRequestBody withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    public String language;
    public PostUsersRequestBody withLanguage(String language) {
        this.language = language;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login")
    public String login;
    public PostUsersRequestBody withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public PostUsersRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    public String phone;
    public PostUsersRequestBody withPhone(String phone) {
        this.phone = phone;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public PostUsersRequestBodyRoleEnum role;
    public PostUsersRequestBody withRole(PostUsersRequestBodyRoleEnum role) {
        this.role = role;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("space_amount")
    public Long spaceAmount;
    public PostUsersRequestBody withSpaceAmount(Long spaceAmount) {
        this.spaceAmount = spaceAmount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public PostUsersRequestBodyStatusEnum status;
    public PostUsersRequestBody withStatus(PostUsersRequestBodyStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    public String timezone;
    public PostUsersRequestBody withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_codes")
    public .models.shared.TrackingCode[] trackingCodes;
    public PostUsersRequestBody withTrackingCodes(.models.shared.TrackingCode[] trackingCodes) {
        this.trackingCodes = trackingCodes;
        return this;
    }
}