package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostUsersIDAvatarPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type PostUsersIDAvatarRequestBodyPic struct {
	Content []byte `multipartForm:"content"`
	Pic     string `multipartForm:"name=pic"`
}

type PostUsersIDAvatarRequestBody struct {
	Pic PostUsersIDAvatarRequestBodyPic `multipartForm:"file"`
}

type PostUsersIDAvatarRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostUsersIDAvatarPathParams
	Request    *PostUsersIDAvatarRequestBody `request:"mediaType=multipart/form-data"`
}

type PostUsersIDAvatarResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	UserAvatar  *shared.UserAvatar
}
