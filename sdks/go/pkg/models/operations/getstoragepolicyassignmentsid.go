package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetStoragePolicyAssignmentsIDPathParams struct {
	StoragePolicyAssignmentID string `pathParam:"style=simple,explode=false,name=storage_policy_assignment_id"`
}

type GetStoragePolicyAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetStoragePolicyAssignmentsIDPathParams
}

type GetStoragePolicyAssignmentsIDResponse struct {
	ClientError             *shared.ClientError
	ContentType             string
	StatusCode              int64
	StoragePolicyAssignment *shared.StoragePolicyAssignment
}
