package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetLegalHoldPolicyAssignmentsIDPathParams struct {
	LegalHoldPolicyAssignmentID string `pathParam:"style=simple,explode=false,name=legal_hold_policy_assignment_id"`
}

type GetLegalHoldPolicyAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetLegalHoldPolicyAssignmentsIDPathParams
}

type GetLegalHoldPolicyAssignmentsIDResponse struct {
	ClientError               *shared.ClientError
	ContentType               string
	LegalHoldPolicyAssignment *shared.LegalHoldPolicyAssignment
	StatusCode                int64
}
