package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteRetentionPoliciesIDPathParams struct {
	RetentionPolicyID string `pathParam:"style=simple,explode=false,name=retention_policy_id"`
}

type DeleteRetentionPoliciesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteRetentionPoliciesIDPathParams
}

type DeleteRetentionPoliciesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
