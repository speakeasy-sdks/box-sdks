package shared

type ConflictErrorCodeEnum string

const (
	ConflictErrorCodeEnumCreated             ConflictErrorCodeEnum = "created"
	ConflictErrorCodeEnumAccepted            ConflictErrorCodeEnum = "accepted"
	ConflictErrorCodeEnumNoContent           ConflictErrorCodeEnum = "no_content"
	ConflictErrorCodeEnumRedirect            ConflictErrorCodeEnum = "redirect"
	ConflictErrorCodeEnumNotModified         ConflictErrorCodeEnum = "not_modified"
	ConflictErrorCodeEnumBadRequest          ConflictErrorCodeEnum = "bad_request"
	ConflictErrorCodeEnumUnauthorized        ConflictErrorCodeEnum = "unauthorized"
	ConflictErrorCodeEnumForbidden           ConflictErrorCodeEnum = "forbidden"
	ConflictErrorCodeEnumNotFound            ConflictErrorCodeEnum = "not_found"
	ConflictErrorCodeEnumMethodNotAllowed    ConflictErrorCodeEnum = "method_not_allowed"
	ConflictErrorCodeEnumConflict            ConflictErrorCodeEnum = "conflict"
	ConflictErrorCodeEnumPreconditionFailed  ConflictErrorCodeEnum = "precondition_failed"
	ConflictErrorCodeEnumTooManyRequests     ConflictErrorCodeEnum = "too_many_requests"
	ConflictErrorCodeEnumInternalServerError ConflictErrorCodeEnum = "internal_server_error"
	ConflictErrorCodeEnumUnavailable         ConflictErrorCodeEnum = "unavailable"
	ConflictErrorCodeEnumItemNameInvalid     ConflictErrorCodeEnum = "item_name_invalid"
	ConflictErrorCodeEnumInsufficientScope   ConflictErrorCodeEnum = "insufficient_scope"
)

type ConflictErrorContextInfo struct {
	Conflicts []FileConflict `json:"conflicts,omitempty"`
}

type ConflictErrorTypeEnum string

const (
	ConflictErrorTypeEnumError ConflictErrorTypeEnum = "error"
)

// ConflictError
// A generic error
type ConflictError struct {
	Code        *ConflictErrorCodeEnum    `json:"code,omitempty"`
	ContextInfo *ConflictErrorContextInfo `json:"context_info,omitempty"`
	HelpURL     *string                   `json:"help_url,omitempty"`
	Message     *string                   `json:"message,omitempty"`
	RequestID   *string                   `json:"request_id,omitempty"`
	Status      *int32                    `json:"status,omitempty"`
	Type        *ConflictErrorTypeEnum    `json:"type,omitempty"`
}
