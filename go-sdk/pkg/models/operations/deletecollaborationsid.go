package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteCollaborationsIDPathParams struct {
	CollaborationID string `pathParam:"style=simple,explode=false,name=collaboration_id"`
}

type DeleteCollaborationsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteCollaborationsIDPathParams
}

type DeleteCollaborationsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
