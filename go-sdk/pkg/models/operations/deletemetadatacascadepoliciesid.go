package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteMetadataCascadePoliciesIDPathParams struct {
	MetadataCascadePolicyID string `pathParam:"style=simple,explode=false,name=metadata_cascade_policy_id"`
}

type DeleteMetadataCascadePoliciesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteMetadataCascadePoliciesIDPathParams
}

type DeleteMetadataCascadePoliciesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
