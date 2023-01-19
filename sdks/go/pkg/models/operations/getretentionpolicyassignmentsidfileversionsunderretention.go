package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionPathParams struct {
	RetentionPolicyAssignmentID string `pathParam:"style=simple,explode=false,name=retention_policy_assignment_id"`
}

type GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionPathParams
	QueryParams GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionQueryParams
}

type GetRetentionPolicyAssignmentsIDFileVersionsUnderRetentionResponse struct {
	ClientError         *shared.ClientError
	ContentType         string
	FilesUnderRetention *shared.FilesUnderRetention
	StatusCode          int64
}
