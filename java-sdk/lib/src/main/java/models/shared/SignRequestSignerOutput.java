package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SignRequestSignerOutput
 * The schema for a Signer in a POST Sign Request request body
**/
public class SignRequestSignerOutput {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("declined_redirect_url")
    public String declinedRedirectUrl;
    public SignRequestSignerOutput withDeclinedRedirectUrl(String declinedRedirectUrl) {
        this.declinedRedirectUrl = declinedRedirectUrl;
        return this;
    }
    @JsonProperty("email")
    public String email;
    public SignRequestSignerOutput withEmail(String email) {
        this.email = email;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("embed_url")
    public String embedUrl;
    public SignRequestSignerOutput withEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("embed_url_external_user_id")
    public String embedUrlExternalUserId;
    public SignRequestSignerOutput withEmbedUrlExternalUserId(String embedUrlExternalUserId) {
        this.embedUrlExternalUserId = embedUrlExternalUserId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_viewed_document")
    public Boolean hasViewedDocument;
    public SignRequestSignerOutput withHasViewedDocument(Boolean hasViewedDocument) {
        this.hasViewedDocument = hasViewedDocument;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inputs")
    public SignRequestSignerInput[] inputs;
    public SignRequestSignerOutput withInputs(SignRequestSignerInput[] inputs) {
        this.inputs = inputs;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_in_person")
    public Boolean isInPerson;
    public SignRequestSignerOutput withIsInPerson(Boolean isInPerson) {
        this.isInPerson = isInPerson;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login_required")
    public Boolean loginRequired;
    public SignRequestSignerOutput withLoginRequired(Boolean loginRequired) {
        this.loginRequired = loginRequired;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public SignRequestSignerOutput withOrder(Long order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirect_url")
    public String redirectUrl;
    public SignRequestSignerOutput withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public SignRequestSignerRoleEnum role;
    public SignRequestSignerOutput withRole(SignRequestSignerRoleEnum role) {
        this.role = role;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signer_decision")
    public SignRequestSignerSignerDecision signerDecision;
    public SignRequestSignerOutput withSignerDecision(SignRequestSignerSignerDecision signerDecision) {
        this.signerDecision = signerDecision;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verification_phone_number")
    public String verificationPhoneNumber;
    public SignRequestSignerOutput withVerificationPhoneNumber(String verificationPhoneNumber) {
        this.verificationPhoneNumber = verificationPhoneNumber;
        return this;
    }
}