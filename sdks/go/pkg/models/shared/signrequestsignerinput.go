package shared

import (
	"time"
)

type SignRequestSignerInputContentTypeEnum string

const (
	SignRequestSignerInputContentTypeEnumInitial   SignRequestSignerInputContentTypeEnum = "initial"
	SignRequestSignerInputContentTypeEnumStamp     SignRequestSignerInputContentTypeEnum = "stamp"
	SignRequestSignerInputContentTypeEnumSignature SignRequestSignerInputContentTypeEnum = "signature"
	SignRequestSignerInputContentTypeEnumCompany   SignRequestSignerInputContentTypeEnum = "company"
	SignRequestSignerInputContentTypeEnumTitle     SignRequestSignerInputContentTypeEnum = "title"
	SignRequestSignerInputContentTypeEnumEmail     SignRequestSignerInputContentTypeEnum = "email"
	SignRequestSignerInputContentTypeEnumFullName  SignRequestSignerInputContentTypeEnum = "full_name"
	SignRequestSignerInputContentTypeEnumFirstName SignRequestSignerInputContentTypeEnum = "first_name"
	SignRequestSignerInputContentTypeEnumLastName  SignRequestSignerInputContentTypeEnum = "last_name"
	SignRequestSignerInputContentTypeEnumText      SignRequestSignerInputContentTypeEnum = "text"
	SignRequestSignerInputContentTypeEnumDate      SignRequestSignerInputContentTypeEnum = "date"
	SignRequestSignerInputContentTypeEnumCheckbox  SignRequestSignerInputContentTypeEnum = "checkbox"
)

type SignRequestSignerInputTypeEnum string

const (
	SignRequestSignerInputTypeEnumSignature SignRequestSignerInputTypeEnum = "signature"
	SignRequestSignerInputTypeEnumDate      SignRequestSignerInputTypeEnum = "date"
	SignRequestSignerInputTypeEnumText      SignRequestSignerInputTypeEnum = "text"
	SignRequestSignerInputTypeEnumCheckbox  SignRequestSignerInputTypeEnum = "checkbox"
)

// SignRequestSignerInput
// Prefill tags are used to prefill placeholders with signer input data. Only
// one value field can be included.
type SignRequestSignerInput struct {
	CheckboxValue *bool                                  `json:"checkbox_value,omitempty"`
	ContentType   *SignRequestSignerInputContentTypeEnum `json:"content_type,omitempty"`
	DateValue     *time.Time                             `json:"date_value,omitempty"`
	DocumentTagID *string                                `json:"document_tag_id,omitempty"`
	PageIndex     int64                                  `json:"page_index"`
	TextValue     *string                                `json:"text_value,omitempty"`
	Type          *SignRequestSignerInputTypeEnum        `json:"type,omitempty"`
}
