package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetLegalHoldPolicyAssignmentsIDFilesOnHoldPathParams struct {
	LegalHoldPolicyAssignmentID string `pathParam:"style=simple,explode=false,name=legal_hold_policy_assignment_id"`
}

type GetLegalHoldPolicyAssignmentsIDFilesOnHoldQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Marker *string  `queryParam:"style=form,explode=true,name=marker"`
}

type GetLegalHoldPolicyAssignmentsIDFilesOnHoldRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetLegalHoldPolicyAssignmentsIDFilesOnHoldPathParams
	QueryParams GetLegalHoldPolicyAssignmentsIDFilesOnHoldQueryParams
}

type GetLegalHoldPolicyAssignmentsIDFilesOnHoldResponse struct {
	ClientError           *shared.ClientError
	ContentType           string
	FileVersionLegalHolds *shared.FileVersionLegalHolds
	StatusCode            int64
}
