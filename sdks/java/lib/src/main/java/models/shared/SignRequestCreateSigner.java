package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SignRequestCreateSigner
 * The schema for a Signer in a POST Sign Request request body
**/
public class SignRequestCreateSigner {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("declined_redirect_url")
    public String declinedRedirectUrl;
    public SignRequestCreateSigner withDeclinedRedirectUrl(String declinedRedirectUrl) {
        this.declinedRedirectUrl = declinedRedirectUrl;
        return this;
    }
    @JsonProperty("email")
    public String email;
    public SignRequestCreateSigner withEmail(String email) {
        this.email = email;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("embed_url_external_user_id")
    public String embedUrlExternalUserId;
    public SignRequestCreateSigner withEmbedUrlExternalUserId(String embedUrlExternalUserId) {
        this.embedUrlExternalUserId = embedUrlExternalUserId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_in_person")
    public Boolean isInPerson;
    public SignRequestCreateSigner withIsInPerson(Boolean isInPerson) {
        this.isInPerson = isInPerson;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("login_required")
    public Boolean loginRequired;
    public SignRequestCreateSigner withLoginRequired(Boolean loginRequired) {
        this.loginRequired = loginRequired;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public SignRequestCreateSigner withOrder(Long order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SignRequestCreateSigner withPassword(String password) {
        this.password = password;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirect_url")
    public String redirectUrl;
    public SignRequestCreateSigner withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public SignRequestCreateSignerRoleEnum role;
    public SignRequestCreateSigner withRole(SignRequestCreateSignerRoleEnum role) {
        this.role = role;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verification_phone_number")
    public String verificationPhoneNumber;
    public SignRequestCreateSigner withVerificationPhoneNumber(String verificationPhoneNumber) {
        this.verificationPhoneNumber = verificationPhoneNumber;
        return this;
    }
}