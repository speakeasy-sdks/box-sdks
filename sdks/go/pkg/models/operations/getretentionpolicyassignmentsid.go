package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetRetentionPolicyAssignmentsIDPathParams struct {
	RetentionPolicyAssignmentID string `pathParam:"style=simple,explode=false,name=retention_policy_assignment_id"`
}

type GetRetentionPolicyAssignmentsIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type GetRetentionPolicyAssignmentsIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetRetentionPolicyAssignmentsIDPathParams
	QueryParams GetRetentionPolicyAssignmentsIDQueryParams
}

type GetRetentionPolicyAssignmentsIDResponse struct {
	ClientError               *shared.ClientError
	ContentType               string
	RetentionPolicyAssignment *shared.RetentionPolicyAssignment
	StatusCode                int64
}
