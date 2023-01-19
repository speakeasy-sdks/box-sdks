package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldPathParams struct {
	LegalHoldPolicyAssignmentID string `pathParam:"style=simple,explode=false,name=legal_hold_policy_assignment_id"`
}

type GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Marker *string  `queryParam:"style=form,explode=true,name=marker"`
}

type GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldPathParams
	QueryParams GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldQueryParams
}

type GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldResponse struct {
	ClientError           *shared.ClientError
	ContentType           string
	FileVersionLegalHolds *shared.FileVersionLegalHolds
	StatusCode            int64
}
