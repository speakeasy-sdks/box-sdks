package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enterprise_has_two_factor_auth_enabled")
    public Boolean enterpriseHasTwoFactorAuthEnabled;
    public CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement withEnterpriseHasTwoFactorAuthEnabled(Boolean enterpriseHasTwoFactorAuthEnabled) {
        this.enterpriseHasTwoFactorAuthEnabled = enterpriseHasTwoFactorAuthEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_has_two_factor_authentication_enabled")
    public Boolean userHasTwoFactorAuthenticationEnabled;
    public CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement withUserHasTwoFactorAuthenticationEnabled(Boolean userHasTwoFactorAuthenticationEnabled) {
        this.userHasTwoFactorAuthenticationEnabled = userHasTwoFactorAuthenticationEnabled;
        return this;
    }
}