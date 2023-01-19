package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteLegalHoldPolicyAssignmentsIDPathParams struct {
	LegalHoldPolicyAssignmentID string `pathParam:"style=simple,explode=false,name=legal_hold_policy_assignment_id"`
}

type DeleteLegalHoldPolicyAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteLegalHoldPolicyAssignmentsIDPathParams
}

type DeleteLegalHoldPolicyAssignmentsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
