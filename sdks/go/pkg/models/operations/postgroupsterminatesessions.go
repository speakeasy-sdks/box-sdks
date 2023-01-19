package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostGroupsTerminateSessionsRequestBody struct {
	GroupIds []string `json:"group_ids"`
}

type PostGroupsTerminateSessionsRequest struct {
	Retries *utils.RetryConfig
	Request *PostGroupsTerminateSessionsRequestBody `request:"mediaType=application/json"`
}

type PostGroupsTerminateSessionsResponse struct {
	ClientError               *shared.ClientError
	ContentType               string
	SessionTerminationMessage *shared.SessionTerminationMessage
	StatusCode                int64
}
