package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetLegalHoldPoliciesIDPathParams struct {
	LegalHoldPolicyID string `pathParam:"style=simple,explode=false,name=legal_hold_policy_id"`
}

type GetLegalHoldPoliciesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetLegalHoldPoliciesIDPathParams
}

type GetLegalHoldPoliciesIDResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	LegalHoldPolicy *shared.LegalHoldPolicy
	StatusCode      int64
}
