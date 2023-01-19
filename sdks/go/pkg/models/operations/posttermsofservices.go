package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostTermsOfServicesRequestBodyStatusEnum string

const (
	PostTermsOfServicesRequestBodyStatusEnumEnabled  PostTermsOfServicesRequestBodyStatusEnum = "enabled"
	PostTermsOfServicesRequestBodyStatusEnumDisabled PostTermsOfServicesRequestBodyStatusEnum = "disabled"
)

type PostTermsOfServicesRequestBodyTosTypeEnum string

const (
	PostTermsOfServicesRequestBodyTosTypeEnumExternal PostTermsOfServicesRequestBodyTosTypeEnum = "external"
	PostTermsOfServicesRequestBodyTosTypeEnumManaged  PostTermsOfServicesRequestBodyTosTypeEnum = "managed"
)

type PostTermsOfServicesRequestBody struct {
	Status  PostTermsOfServicesRequestBodyStatusEnum   `json:"status"`
	Text    string                                     `json:"text"`
	TosType *PostTermsOfServicesRequestBodyTosTypeEnum `json:"tos_type,omitempty"`
}

type PostTermsOfServicesRequest struct {
	Retries *utils.RetryConfig
	Request *PostTermsOfServicesRequestBody `request:"mediaType=application/json"`
}

type PostTermsOfServicesResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Task        *shared.Task
}
