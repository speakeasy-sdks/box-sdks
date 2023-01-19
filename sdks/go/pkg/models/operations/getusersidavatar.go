package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetUsersIDAvatarPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type GetUsersIDAvatarRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetUsersIDAvatarPathParams
}

type GetUsersIDAvatarResponse struct {
	ClientError                             *shared.ClientError
	ContentType                             string
	StatusCode                              int64
	GetUsersIDAvatar200ImageJpgBinaryString []byte
}
