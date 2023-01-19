package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_accepted")
    public Boolean isAccepted;
    public CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement withIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terms_of_service")
    public TermsOfServiceBase termsOfService;
    public CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement withTermsOfService(TermsOfServiceBase termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }
}