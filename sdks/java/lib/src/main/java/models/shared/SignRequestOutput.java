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
 * SignRequestOutput
 * A request to create a sign request object
**/
public class SignRequestOutput {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("are_reminders_enabled")
    public Boolean areRemindersEnabled;
    public SignRequestOutput withAreRemindersEnabled(Boolean areRemindersEnabled) {
        this.areRemindersEnabled = areRemindersEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("are_text_signatures_enabled")
    public Boolean areTextSignaturesEnabled;
    public SignRequestOutput withAreTextSignaturesEnabled(Boolean areTextSignaturesEnabled) {
        this.areTextSignaturesEnabled = areTextSignaturesEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("auto_expire_at")
    public OffsetDateTime autoExpireAt;
    public SignRequestOutput withAutoExpireAt(OffsetDateTime autoExpireAt) {
        this.autoExpireAt = autoExpireAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("days_valid")
    public Long daysValid;
    public SignRequestOutput withDaysValid(Long daysValid) {
        this.daysValid = daysValid;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("declined_redirect_url")
    public String declinedRedirectUrl;
    public SignRequestOutput withDeclinedRedirectUrl(String declinedRedirectUrl) {
        this.declinedRedirectUrl = declinedRedirectUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_message")
    public String emailMessage;
    public SignRequestOutput withEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_subject")
    public String emailSubject;
    public SignRequestOutput withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    public String externalId;
    public SignRequestOutput withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public SignRequestOutput withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_document_preparation_needed")
    public Boolean isDocumentPreparationNeeded;
    public SignRequestOutput withIsDocumentPreparationNeeded(Boolean isDocumentPreparationNeeded) {
        this.isDocumentPreparationNeeded = isDocumentPreparationNeeded;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_phone_verification_required_to_view")
    public Boolean isPhoneVerificationRequiredToView;
    public SignRequestOutput withIsPhoneVerificationRequiredToView(Boolean isPhoneVerificationRequiredToView) {
        this.isPhoneVerificationRequiredToView = isPhoneVerificationRequiredToView;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public SignRequestOutput withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("parent_folder")
    public FolderMini parentFolder;
    public SignRequestOutput withParentFolder(FolderMini parentFolder) {
        this.parentFolder = parentFolder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefill_tags")
    public SignRequestPrefillTag[] prefillTags;
    public SignRequestOutput withPrefillTags(SignRequestPrefillTag[] prefillTags) {
        this.prefillTags = prefillTags;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prepare_url")
    public String prepareUrl;
    public SignRequestOutput withPrepareUrl(String prepareUrl) {
        this.prepareUrl = prepareUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirect_url")
    public String redirectUrl;
    public SignRequestOutput withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sign_files")
    public SignRequestSignFiles signFiles;
    public SignRequestOutput withSignFiles(SignRequestSignFiles signFiles) {
        this.signFiles = signFiles;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signature_color")
    public SignRequestSignatureColorEnum signatureColor;
    public SignRequestOutput withSignatureColor(SignRequestSignatureColorEnum signatureColor) {
        this.signatureColor = signatureColor;
        return this;
    }
    @JsonProperty("signers")
    public SignRequestSignerOutput[] signers;
    public SignRequestOutput withSigners(SignRequestSignerOutput[] signers) {
        this.signers = signers;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signing_log")
    public FileMini signingLog;
    public SignRequestOutput withSigningLog(FileMini signingLog) {
        this.signingLog = signingLog;
        return this;
    }
    @JsonProperty("source_files")
    public FileBase[] sourceFiles;
    public SignRequestOutput withSourceFiles(FileBase[] sourceFiles) {
        this.sourceFiles = sourceFiles;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public SignRequestStatusEnum status;
    public SignRequestOutput withStatus(SignRequestStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public SignRequestTypeEnum type;
    public SignRequestOutput withType(SignRequestTypeEnum type) {
        this.type = type;
        return this;
    }
}