package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetStoragePoliciesIDPathParams struct {
	StoragePolicyID string `pathParam:"style=simple,explode=false,name=storage_policy_id"`
}

type GetStoragePoliciesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetStoragePoliciesIDPathParams
}

type GetStoragePoliciesIDResponse struct {
	ClientError   *shared.ClientError
	ContentType   string
	StatusCode    int64
	StoragePolicy *shared.StoragePolicy
}
