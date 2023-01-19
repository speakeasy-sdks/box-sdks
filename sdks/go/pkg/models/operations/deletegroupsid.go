package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteGroupsIDPathParams struct {
	GroupID string `pathParam:"style=simple,explode=false,name=group_id"`
}

type DeleteGroupsIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteGroupsIDPathParams
}

type DeleteGroupsIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
