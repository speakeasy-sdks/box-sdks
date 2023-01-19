package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CollaborationAcceptanceRequirementsStatus {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("strong_password_requirement")
    public CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement strongPasswordRequirement;
    public CollaborationAcceptanceRequirementsStatus withStrongPasswordRequirement(CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement strongPasswordRequirement) {
        this.strongPasswordRequirement = strongPasswordRequirement;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terms_of_service_requirement")
    public CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement termsOfServiceRequirement;
    public CollaborationAcceptanceRequirementsStatus withTermsOfServiceRequirement(CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement termsOfServiceRequirement) {
        this.termsOfServiceRequirement = termsOfServiceRequirement;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("two_factor_authentication_requirement")
    public CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement twoFactorAuthenticationRequirement;
    public CollaborationAcceptanceRequirementsStatus withTwoFactorAuthenticationRequirement(CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement twoFactorAuthenticationRequirement) {
        this.twoFactorAuthenticationRequirement = twoFactorAuthenticationRequirement;
        return this;
    }
}