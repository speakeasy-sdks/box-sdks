package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var PostOauth2TokenNumberRefreshServerList = []string{
	"https://api.box.com",
}

type PostOauth2TokenNumberRefreshRequest struct {
	Retries   *utils.RetryConfig
	ServerURL *string
	Request   *shared.PostOAuth2TokenRefreshAccessToken `request:"mediaType=application/x-www-form-urlencoded"`
}

type PostOauth2TokenNumberRefreshResponse struct {
	AccessToken *shared.AccessToken
	ContentType string
	OAuth2Error *shared.OAuth2Error
	StatusCode  int64
}
