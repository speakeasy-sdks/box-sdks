package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum string

const (
	PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnumEnterprise       PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum = "enterprise"
	PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnumFolder           PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum = "folder"
	PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnumMetadataTemplate PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum = "metadata_template"
)

// PostRetentionPolicyAssignmentsRequestBodyAssignTo
// The item to assign the policy to
type PostRetentionPolicyAssignmentsRequestBodyAssignTo struct {
	ID   string                                                    `json:"id"`
	Type PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum `json:"type"`
}

type PostRetentionPolicyAssignmentsRequestBodyFilterFields struct {
	Field *string `json:"field,omitempty"`
	Value *string `json:"value,omitempty"`
}

type PostRetentionPolicyAssignmentsRequestBody struct {
	AssignTo       PostRetentionPolicyAssignmentsRequestBodyAssignTo       `json:"assign_to"`
	FilterFields   []PostRetentionPolicyAssignmentsRequestBodyFilterFields `json:"filter_fields,omitempty"`
	PolicyID       string                                                  `json:"policy_id"`
	StartDateField *string                                                 `json:"start_date_field,omitempty"`
}

type PostRetentionPolicyAssignmentsRequest struct {
	Retries *utils.RetryConfig
	Request *PostRetentionPolicyAssignmentsRequestBody `request:"mediaType=application/json"`
}

type PostRetentionPolicyAssignmentsResponse struct {
	ClientError               *shared.ClientError
	ContentType               string
	RetentionPolicyAssignment *shared.RetentionPolicyAssignment
	StatusCode                int64
}
