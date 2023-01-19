package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutUsersIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public String address;
    public PutUsersIdRequestBody withAddress(String address) {
        this.address = address;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_see_managed_users")
    public Boolean canSeeManagedUsers;
    public PutUsersIdRequestBody withCanSeeManagedUsers(Boolean canSeeManagedUsers) {
        this.canSeeManagedUsers = canSeeManagedUsers;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enterprise")
    public String enterprise;
    public PutUsersIdRequestBody withEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_app_user_id")
    public String externalAppUserId;
    public PutUsersIdRequestBody withExternalAppUserId(String externalAppUserId) {
        this.externalAppUserId = externalAppUserId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_exempt_from_device_limits")
    public Boolean isExemptFromDeviceLimits;
    public PutUsersIdRequestBody withIsExemptFromDeviceLimits(Boolean isExemptFromDeviceLimits) {
        this.isExemptFromDeviceLimits = isExemptFromDeviceLimits;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_exempt_from_login_verification")
    public Boolean isExemptFromLoginVerification;
    public PutUsersIdRequestBody withIsExemptFromLoginVerification(Boolean isExemptFromLoginVerification) {
        this.isExemptFromLoginVerification = isExemptFromLoginVerification;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_external_collab_restricted")
    public Boolean isExternalCollabRestricted;
    public PutUsersIdRequestBody withIsExternalCollabRestricted(Boolean isExternalCollabRestricted) {
        this.isExternalCollabRestricted = isExternalCollabRestricted;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_password_reset_required")
    public Boolean isPasswordResetRequired;
    public PutUsersIdRequestBody withIsPasswordResetRequired(Boolean isPasswordResetRequired) {
        this.isPasswordResetRequired = isPasswordResetRequired;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sync_enabled")
    public Boolean isSyncEnabled;
    public PutUsersIdRequestBody withIsSyncEnabled(Boolean isSyncEnabled) {
        this.isSyncEnabled = isSyncEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_title")
    public String jobTitle;
    public PutUsersIdRequestBody withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    public String language;
    public PutUsersIdRequestBody withLanguage(String language) {
        this.language = language;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login")
    public String login;
    public PutUsersIdRequestBody withLogin(String login) {
        this.login = login;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PutUsersIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notification_email")
    public PutUsersIdRequestBodyNotificationEmail notificationEmail;
    public PutUsersIdRequestBody withNotificationEmail(PutUsersIdRequestBodyNotificationEmail notificationEmail) {
        this.notificationEmail = notificationEmail;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notify")
    public Boolean notify;
    public PutUsersIdRequestBody withNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    public String phone;
    public PutUsersIdRequestBody withPhone(String phone) {
        this.phone = phone;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public PutUsersIdRequestBodyRoleEnum role;
    public PutUsersIdRequestBody withRole(PutUsersIdRequestBodyRoleEnum role) {
        this.role = role;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("space_amount")
    public Long spaceAmount;
    public PutUsersIdRequestBody withSpaceAmount(Long spaceAmount) {
        this.spaceAmount = spaceAmount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public PutUsersIdRequestBodyStatusEnum status;
    public PutUsersIdRequestBody withStatus(PutUsersIdRequestBodyStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    public String timezone;
    public PutUsersIdRequestBody withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_codes")
    public .models.shared.TrackingCode[] trackingCodes;
    public PutUsersIdRequestBody withTrackingCodes(.models.shared.TrackingCode[] trackingCodes) {
        this.trackingCodes = trackingCodes;
        return this;
    }
}