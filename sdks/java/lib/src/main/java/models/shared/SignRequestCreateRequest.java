package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SignRequestCreateRequest
 * A request to create a sign request object
**/
public class SignRequestCreateRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("are_reminders_enabled")
    public Boolean areRemindersEnabled;
    public SignRequestCreateRequest withAreRemindersEnabled(Boolean areRemindersEnabled) {
        this.areRemindersEnabled = areRemindersEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("are_text_signatures_enabled")
    public Boolean areTextSignaturesEnabled;
    public SignRequestCreateRequest withAreTextSignaturesEnabled(Boolean areTextSignaturesEnabled) {
        this.areTextSignaturesEnabled = areTextSignaturesEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("days_valid")
    public Long daysValid;
    public SignRequestCreateRequest withDaysValid(Long daysValid) {
        this.daysValid = daysValid;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("declined_redirect_url")
    public String declinedRedirectUrl;
    public SignRequestCreateRequest withDeclinedRedirectUrl(String declinedRedirectUrl) {
        this.declinedRedirectUrl = declinedRedirectUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_message")
    public String emailMessage;
    public SignRequestCreateRequest withEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_subject")
    public String emailSubject;
    public SignRequestCreateRequest withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    public String externalId;
    public SignRequestCreateRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_document_preparation_needed")
    public Boolean isDocumentPreparationNeeded;
    public SignRequestCreateRequest withIsDocumentPreparationNeeded(Boolean isDocumentPreparationNeeded) {
        this.isDocumentPreparationNeeded = isDocumentPreparationNeeded;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_phone_verification_required_to_view")
    public Boolean isPhoneVerificationRequiredToView;
    public SignRequestCreateRequest withIsPhoneVerificationRequiredToView(Boolean isPhoneVerificationRequiredToView) {
        this.isPhoneVerificationRequiredToView = isPhoneVerificationRequiredToView;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public SignRequestCreateRequest withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("parent_folder")
    public FolderMini parentFolder;
    public SignRequestCreateRequest withParentFolder(FolderMini parentFolder) {
        this.parentFolder = parentFolder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefill_tags")
    public SignRequestPrefillTag[] prefillTags;
    public SignRequestCreateRequest withPrefillTags(SignRequestPrefillTag[] prefillTags) {
        this.prefillTags = prefillTags;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirect_url")
    public String redirectUrl;
    public SignRequestCreateRequest withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signature_color")
    public SignRequestCreateRequestSignatureColorEnum signatureColor;
    public SignRequestCreateRequest withSignatureColor(SignRequestCreateRequestSignatureColorEnum signatureColor) {
        this.signatureColor = signatureColor;
        return this;
    }
    @JsonProperty("signers")
    public SignRequestCreateSigner[] signers;
    public SignRequestCreateRequest withSigners(SignRequestCreateSigner[] signers) {
        this.signers = signers;
        return this;
    }
    @JsonProperty("source_files")
    public FileBase[] sourceFiles;
    public SignRequestCreateRequest withSourceFiles(FileBase[] sourceFiles) {
        this.sourceFiles = sourceFiles;
        return this;
    }
}