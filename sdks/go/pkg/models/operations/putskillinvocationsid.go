package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutSkillInvocationsIDPathParams struct {
	SkillID string `pathParam:"style=simple,explode=false,name=skill_id"`
}

type PutSkillInvocationsIDRequestBodyFileTypeEnum string

const (
	PutSkillInvocationsIDRequestBodyFileTypeEnumFile PutSkillInvocationsIDRequestBodyFileTypeEnum = "file"
)

// PutSkillInvocationsIDRequestBodyFile
// The file to assign the cards to.
type PutSkillInvocationsIDRequestBodyFile struct {
	ID   *string                                       `json:"id,omitempty"`
	Type *PutSkillInvocationsIDRequestBodyFileTypeEnum `json:"type,omitempty"`
}

type PutSkillInvocationsIDRequestBodyFileVersionTypeEnum string

const (
	PutSkillInvocationsIDRequestBodyFileVersionTypeEnumFileVersion PutSkillInvocationsIDRequestBodyFileVersionTypeEnum = "file_version"
)

// PutSkillInvocationsIDRequestBodyFileVersion
// The optional file version to assign the cards to.
type PutSkillInvocationsIDRequestBodyFileVersion struct {
	ID   *string                                              `json:"id,omitempty"`
	Type *PutSkillInvocationsIDRequestBodyFileVersionTypeEnum `json:"type,omitempty"`
}

// PutSkillInvocationsIDRequestBodyMetadata
// The metadata to set for this skill. This is a list of
// Box Skills cards. These cards will overwrite any existing Box
// skill cards on the file.
type PutSkillInvocationsIDRequestBodyMetadata struct {
	Cards []interface{} `json:"cards,omitempty"`
}

type PutSkillInvocationsIDRequestBodyStatusEnum string

const (
	PutSkillInvocationsIDRequestBodyStatusEnumInvoked          PutSkillInvocationsIDRequestBodyStatusEnum = "invoked"
	PutSkillInvocationsIDRequestBodyStatusEnumProcessing       PutSkillInvocationsIDRequestBodyStatusEnum = "processing"
	PutSkillInvocationsIDRequestBodyStatusEnumSuccess          PutSkillInvocationsIDRequestBodyStatusEnum = "success"
	PutSkillInvocationsIDRequestBodyStatusEnumTransientFailure PutSkillInvocationsIDRequestBodyStatusEnum = "transient_failure"
	PutSkillInvocationsIDRequestBodyStatusEnumPermanentFailure PutSkillInvocationsIDRequestBodyStatusEnum = "permanent_failure"
)

// PutSkillInvocationsIDRequestBodyUsage
// A descriptor that defines what items are affected by this call.
//
// Set this to the default values when setting a card to a `success`
// state, and leave it out in most other situations.
type PutSkillInvocationsIDRequestBodyUsage struct {
	Unit  *string  `json:"unit,omitempty"`
	Value *float64 `json:"value,omitempty"`
}

type PutSkillInvocationsIDRequestBody struct {
	File        PutSkillInvocationsIDRequestBodyFile         `json:"file"`
	FileVersion *PutSkillInvocationsIDRequestBodyFileVersion `json:"file_version,omitempty"`
	Metadata    PutSkillInvocationsIDRequestBodyMetadata     `json:"metadata"`
	Status      PutSkillInvocationsIDRequestBodyStatusEnum   `json:"status"`
	Usage       *PutSkillInvocationsIDRequestBodyUsage       `json:"usage,omitempty"`
}

type PutSkillInvocationsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutSkillInvocationsIDPathParams
	Request    *PutSkillInvocationsIDRequestBody `request:"mediaType=application/json"`
}

type PutSkillInvocationsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
