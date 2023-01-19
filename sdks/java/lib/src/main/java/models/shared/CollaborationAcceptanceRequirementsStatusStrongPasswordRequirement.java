package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enterprise_has_strong_password_required_for_external_users")
    public Boolean enterpriseHasStrongPasswordRequiredForExternalUsers;
    public CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement withEnterpriseHasStrongPasswordRequiredForExternalUsers(Boolean enterpriseHasStrongPasswordRequiredForExternalUsers) {
        this.enterpriseHasStrongPasswordRequiredForExternalUsers = enterpriseHasStrongPasswordRequiredForExternalUsers;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_has_strong_password")
    public Boolean userHasStrongPassword;
    public CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement withUserHasStrongPassword(Boolean userHasStrongPassword) {
        this.userHasStrongPassword = userHasStrongPassword;
        return this;
    }
}