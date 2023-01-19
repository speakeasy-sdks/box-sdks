package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataCascadePoliciesIDPathParams struct {
	MetadataCascadePolicyID string `pathParam:"style=simple,explode=false,name=metadata_cascade_policy_id"`
}

type GetMetadataCascadePoliciesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetMetadataCascadePoliciesIDPathParams
}

type GetMetadataCascadePoliciesIDResponse struct {
	ClientError           *shared.ClientError
	ContentType           string
	MetadataCascadePolicy *shared.MetadataCascadePolicy
	StatusCode            int64
}
