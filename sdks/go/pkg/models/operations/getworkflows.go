package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetWorkflowsQueryParams struct {
	FolderID    string  `queryParam:"style=form,explode=true,name=folder_id"`
	Limit       *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker      *string `queryParam:"style=form,explode=true,name=marker"`
	TriggerType *string `queryParam:"style=form,explode=true,name=trigger_type"`
}

type GetWorkflowsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetWorkflowsQueryParams
}

type GetWorkflowsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Workflows   *shared.Workflows
}
