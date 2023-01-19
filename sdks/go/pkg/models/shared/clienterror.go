package shared

type ClientErrorCodeEnum string

const (
	ClientErrorCodeEnumCreated             ClientErrorCodeEnum = "created"
	ClientErrorCodeEnumAccepted            ClientErrorCodeEnum = "accepted"
	ClientErrorCodeEnumNoContent           ClientErrorCodeEnum = "no_content"
	ClientErrorCodeEnumRedirect            ClientErrorCodeEnum = "redirect"
	ClientErrorCodeEnumNotModified         ClientErrorCodeEnum = "not_modified"
	ClientErrorCodeEnumBadRequest          ClientErrorCodeEnum = "bad_request"
	ClientErrorCodeEnumUnauthorized        ClientErrorCodeEnum = "unauthorized"
	ClientErrorCodeEnumForbidden           ClientErrorCodeEnum = "forbidden"
	ClientErrorCodeEnumNotFound            ClientErrorCodeEnum = "not_found"
	ClientErrorCodeEnumMethodNotAllowed    ClientErrorCodeEnum = "method_not_allowed"
	ClientErrorCodeEnumConflict            ClientErrorCodeEnum = "conflict"
	ClientErrorCodeEnumPreconditionFailed  ClientErrorCodeEnum = "precondition_failed"
	ClientErrorCodeEnumTooManyRequests     ClientErrorCodeEnum = "too_many_requests"
	ClientErrorCodeEnumInternalServerError ClientErrorCodeEnum = "internal_server_error"
	ClientErrorCodeEnumUnavailable         ClientErrorCodeEnum = "unavailable"
	ClientErrorCodeEnumItemNameInvalid     ClientErrorCodeEnum = "item_name_invalid"
	ClientErrorCodeEnumInsufficientScope   ClientErrorCodeEnum = "insufficient_scope"
)

// ClientErrorContextInfo
// A free-form object that contains additional context
// about the error. The possible fields are defined on
// a per-endpoint basis. `message` is only one example.
type ClientErrorContextInfo struct {
	Message *string `json:"message,omitempty"`
}

type ClientErrorTypeEnum string

const (
	ClientErrorTypeEnumError ClientErrorTypeEnum = "error"
)

// ClientError
// A generic error
type ClientError struct {
	Code        *ClientErrorCodeEnum    `json:"code,omitempty"`
	ContextInfo *ClientErrorContextInfo `json:"context_info,omitempty"`
	HelpURL     *string                 `json:"help_url,omitempty"`
	Message     *string                 `json:"message,omitempty"`
	RequestID   *string                 `json:"request_id,omitempty"`
	Status      *int32                  `json:"status,omitempty"`
	Type        *ClientErrorTypeEnum    `json:"type,omitempty"`
}
