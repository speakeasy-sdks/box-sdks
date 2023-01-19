package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteStoragePolicyAssignmentsIDPathParams struct {
	StoragePolicyAssignmentID string `pathParam:"style=simple,explode=false,name=storage_policy_assignment_id"`
}

type DeleteStoragePolicyAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteStoragePolicyAssignmentsIDPathParams
}

type DeleteStoragePolicyAssignmentsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
