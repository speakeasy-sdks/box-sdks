package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteLegalHoldPoliciesIDPathParams struct {
	LegalHoldPolicyID string `pathParam:"style=simple,explode=false,name=legal_hold_policy_id"`
}

type DeleteLegalHoldPoliciesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteLegalHoldPoliciesIDPathParams
}

type DeleteLegalHoldPoliciesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
