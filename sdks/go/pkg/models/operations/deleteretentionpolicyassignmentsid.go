package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteRetentionPolicyAssignmentsIDPathParams struct {
	RetentionPolicyAssignmentID string `pathParam:"style=simple,explode=false,name=retention_policy_assignment_id"`
}

type DeleteRetentionPolicyAssignmentsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteRetentionPolicyAssignmentsIDPathParams
}

type DeleteRetentionPolicyAssignmentsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
