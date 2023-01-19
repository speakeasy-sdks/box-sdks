package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum string

const (
	PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnumFile        PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum = "file"
	PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnumFileVersion PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum = "file_version"
	PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnumFolder      PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum = "folder"
	PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnumUser        PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum = "user"
)

// PostLegalHoldPolicyAssignmentsRequestBodyAssignTo
// The item to assign the policy to
type PostLegalHoldPolicyAssignmentsRequestBodyAssignTo struct {
	ID   string                                                    `json:"id"`
	Type PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum `json:"type"`
}

type PostLegalHoldPolicyAssignmentsRequestBody struct {
	AssignTo PostLegalHoldPolicyAssignmentsRequestBodyAssignTo `json:"assign_to"`
	PolicyID string                                            `json:"policy_id"`
}

type PostLegalHoldPolicyAssignmentsRequest struct {
	Retries *utils.RetryConfig
	Request *PostLegalHoldPolicyAssignmentsRequestBody `request:"mediaType=application/json"`
}

type PostLegalHoldPolicyAssignmentsResponse struct {
	ClientError               *shared.ClientError
	ContentType               string
	LegalHoldPolicyAssignment *shared.LegalHoldPolicyAssignment
	StatusCode                int64
}
