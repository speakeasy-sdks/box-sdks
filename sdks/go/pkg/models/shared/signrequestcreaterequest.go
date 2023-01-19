package shared

type SignRequestCreateRequestSignatureColorEnum string

const (
	SignRequestCreateRequestSignatureColorEnumBlue  SignRequestCreateRequestSignatureColorEnum = "blue"
	SignRequestCreateRequestSignatureColorEnumBlack SignRequestCreateRequestSignatureColorEnum = "black"
	SignRequestCreateRequestSignatureColorEnumRed   SignRequestCreateRequestSignatureColorEnum = "red"
)

// SignRequestCreateRequest
// A request to create a sign request object
type SignRequestCreateRequest struct {
	AreRemindersEnabled               *bool                                       `json:"are_reminders_enabled,omitempty"`
	AreTextSignaturesEnabled          *bool                                       `json:"are_text_signatures_enabled,omitempty"`
	DaysValid                         *int64                                      `json:"days_valid,omitempty"`
	DeclinedRedirectURL               *string                                     `json:"declined_redirect_url,omitempty"`
	EmailMessage                      *string                                     `json:"email_message,omitempty"`
	EmailSubject                      *string                                     `json:"email_subject,omitempty"`
	ExternalID                        *string                                     `json:"external_id,omitempty"`
	IsDocumentPreparationNeeded       *bool                                       `json:"is_document_preparation_needed,omitempty"`
	IsPhoneVerificationRequiredToView *bool                                       `json:"is_phone_verification_required_to_view,omitempty"`
	Name                              *string                                     `json:"name,omitempty"`
	ParentFolder                      FolderMini                                  `json:"parent_folder"`
	PrefillTags                       []SignRequestPrefillTag                     `json:"prefill_tags,omitempty"`
	RedirectURL                       *string                                     `json:"redirect_url,omitempty"`
	SignatureColor                    *SignRequestCreateRequestSignatureColorEnum `json:"signature_color,omitempty"`
	Signers                           []SignRequestCreateSigner                   `json:"signers"`
	SourceFiles                       []FileBase                                  `json:"source_files"`
}
