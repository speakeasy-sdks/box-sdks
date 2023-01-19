package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetLegalHoldPolicyAssignmentsAssignToTypeEnum string

const (
	GetLegalHoldPolicyAssignmentsAssignToTypeEnumFile        GetLegalHoldPolicyAssignmentsAssignToTypeEnum = "file"
	GetLegalHoldPolicyAssignmentsAssignToTypeEnumFileVersion GetLegalHoldPolicyAssignmentsAssignToTypeEnum = "file_version"
	GetLegalHoldPolicyAssignmentsAssignToTypeEnumFolder      GetLegalHoldPolicyAssignmentsAssignToTypeEnum = "folder"
	GetLegalHoldPolicyAssignmentsAssignToTypeEnumUser        GetLegalHoldPolicyAssignmentsAssignToTypeEnum = "user"
)

type GetLegalHoldPolicyAssignmentsQueryParams struct {
	AssignToID   *string                                        `queryParam:"style=form,explode=true,name=assign_to_id"`
	AssignToType *GetLegalHoldPolicyAssignmentsAssignToTypeEnum `queryParam:"style=form,explode=true,name=assign_to_type"`
	Fields       []string                                       `queryParam:"style=form,explode=false,name=fields"`
	Limit        *int64                                         `queryParam:"style=form,explode=true,name=limit"`
	Marker       *string                                        `queryParam:"style=form,explode=true,name=marker"`
	PolicyID     string                                         `queryParam:"style=form,explode=true,name=policy_id"`
}

type GetLegalHoldPolicyAssignmentsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetLegalHoldPolicyAssignmentsQueryParams
}

type GetLegalHoldPolicyAssignmentsResponse struct {
	ClientError                *shared.ClientError
	ContentType                string
	LegalHoldPolicyAssignments *shared.LegalHoldPolicyAssignments
	StatusCode                 int64
}
