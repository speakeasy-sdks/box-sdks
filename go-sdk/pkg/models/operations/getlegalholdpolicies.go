package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetLegalHoldPoliciesQueryParams struct {
	Fields     []string `queryParam:"style=form,explode=false,name=fields"`
	Limit      *int64   `queryParam:"style=form,explode=true,name=limit"`
	Marker     *string  `queryParam:"style=form,explode=true,name=marker"`
	PolicyName *string  `queryParam:"style=form,explode=true,name=policy_name"`
}

type GetLegalHoldPoliciesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetLegalHoldPoliciesQueryParams
}

type GetLegalHoldPoliciesResponse struct {
	ClientError       *shared.ClientError
	ContentType       string
	LegalHoldPolicies *shared.LegalHoldPolicies
	StatusCode        int64
}
