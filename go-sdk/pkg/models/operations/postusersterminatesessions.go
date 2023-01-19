package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostUsersTerminateSessionsRequestBody struct {
	UserIds    []string `json:"user_ids"`
	UserLogins []string `json:"user_logins"`
}

type PostUsersTerminateSessionsRequest struct {
	Retries *utils.RetryConfig
	Request *PostUsersTerminateSessionsRequestBody `request:"mediaType=application/json"`
}

type PostUsersTerminateSessionsResponse struct {
	ClientError               *shared.ClientError
	ContentType               string
	SessionTerminationMessage *shared.SessionTerminationMessage
	StatusCode                int64
}
