package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetRetentionPolicyAssignmentsIDFilesUnderRetentionPathParams struct {
	RetentionPolicyAssignmentID string `pathParam:"style=simple,explode=false,name=retention_policy_assignment_id"`
}

type GetRetentionPolicyAssignmentsIDFilesUnderRetentionQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetRetentionPolicyAssignmentsIDFilesUnderRetentionRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetRetentionPolicyAssignmentsIDFilesUnderRetentionPathParams
	QueryParams GetRetentionPolicyAssignmentsIDFilesUnderRetentionQueryParams
}

type GetRetentionPolicyAssignmentsIDFilesUnderRetentionResponse struct {
	ClientError         *shared.ClientError
	ContentType         string
	FilesUnderRetention *shared.FilesUnderRetention
	StatusCode          int64
}
