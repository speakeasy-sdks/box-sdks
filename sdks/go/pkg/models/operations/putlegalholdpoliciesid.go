package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutLegalHoldPoliciesIDPathParams struct {
	LegalHoldPolicyID string `pathParam:"style=simple,explode=false,name=legal_hold_policy_id"`
}

type PutLegalHoldPoliciesIDRequestBody struct {
	Description  *string `json:"description,omitempty"`
	PolicyName   *string `json:"policy_name,omitempty"`
	ReleaseNotes *string `json:"release_notes,omitempty"`
}

type PutLegalHoldPoliciesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutLegalHoldPoliciesIDPathParams
	Request    *PutLegalHoldPoliciesIDRequestBody `request:"mediaType=application/json"`
}

type PutLegalHoldPoliciesIDResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	LegalHoldPolicy *shared.LegalHoldPolicy
	StatusCode      int64
}
