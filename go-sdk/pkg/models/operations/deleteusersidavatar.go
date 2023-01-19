package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteUsersIDAvatarPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type DeleteUsersIDAvatarRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteUsersIDAvatarPathParams
}

type DeleteUsersIDAvatarResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
