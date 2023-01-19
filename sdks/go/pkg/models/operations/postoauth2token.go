package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var PostOauth2TokenServerList = []string{
	"https://api.box.com",
}

type PostOauth2TokenRequest struct {
	Retries   *utils.RetryConfig
	ServerURL *string
	Request   *shared.PostOAuth2Token `request:"mediaType=application/x-www-form-urlencoded"`
}

type PostOauth2TokenResponse struct {
	AccessToken *shared.AccessToken
	ContentType string
	OAuth2Error *shared.OAuth2Error
	StatusCode  int64
}
