package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetRetentionPoliciesIDPathParams struct {
	RetentionPolicyID string `pathParam:"style=simple,explode=false,name=retention_policy_id"`
}

type GetRetentionPoliciesIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetRetentionPoliciesIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetRetentionPoliciesIDPathParams
	QueryParams GetRetentionPoliciesIDQueryParams
}

type GetRetentionPoliciesIDResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	RetentionPolicy *shared.RetentionPolicy
	StatusCode      int64
}
