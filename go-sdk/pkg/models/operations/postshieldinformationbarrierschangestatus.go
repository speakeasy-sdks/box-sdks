package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum string

const (
	PostShieldInformationBarriersChangeStatusRequestBodyStatusEnumPending  PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum = "pending"
	PostShieldInformationBarriersChangeStatusRequestBodyStatusEnumDisabled PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum = "disabled"
)

type PostShieldInformationBarriersChangeStatusRequestBody struct {
	ID     string                                                         `json:"id"`
	Status PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum `json:"status"`
}

type PostShieldInformationBarriersChangeStatusRequest struct {
	Retries *utils.RetryConfig
	Request *PostShieldInformationBarriersChangeStatusRequestBody `request:"mediaType=application/json"`
}

type PostShieldInformationBarriersChangeStatusResponse struct {
	ClientError              *shared.ClientError
	ContentType              string
	ShieldInformationBarrier *shared.ShieldInformationBarrier
	StatusCode               int64
}
