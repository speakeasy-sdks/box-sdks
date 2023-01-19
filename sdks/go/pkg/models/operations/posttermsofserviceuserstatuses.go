package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum string

const (
	PostTermsOfServiceUserStatusesRequestBodyTosTypeEnumTermsOfService PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum = "terms_of_service"
)

// PostTermsOfServiceUserStatusesRequestBodyTos
// The terms of service to set the status for.
type PostTermsOfServiceUserStatusesRequestBodyTos struct {
	ID   string                                               `json:"id"`
	Type PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum `json:"type"`
}

type PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum string

const (
	PostTermsOfServiceUserStatusesRequestBodyUserTypeEnumUser PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum = "user"
)

// PostTermsOfServiceUserStatusesRequestBodyUser
// The user to set the status for.
type PostTermsOfServiceUserStatusesRequestBodyUser struct {
	ID   string                                                `json:"id"`
	Type PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum `json:"type"`
}

type PostTermsOfServiceUserStatusesRequestBody struct {
	IsAccepted bool                                          `json:"is_accepted"`
	Tos        PostTermsOfServiceUserStatusesRequestBodyTos  `json:"tos"`
	User       PostTermsOfServiceUserStatusesRequestBodyUser `json:"user"`
}

type PostTermsOfServiceUserStatusesRequest struct {
	Retries *utils.RetryConfig
	Request *PostTermsOfServiceUserStatusesRequestBody `request:"mediaType=application/json"`
}

type PostTermsOfServiceUserStatusesResponse struct {
	ClientError              *shared.ClientError
	ContentType              string
	StatusCode               int64
	TermsOfServiceUserStatus *shared.TermsOfServiceUserStatus
}
