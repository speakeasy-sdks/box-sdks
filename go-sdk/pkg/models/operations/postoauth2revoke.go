package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var PostOauth2RevokeServerList = []string{
	"https://api.box.com",
}

type PostOauth2RevokeRequest struct {
	Retries   *utils.RetryConfig
	ServerURL *string
	Request   *shared.PostOAuth2Revoke `request:"mediaType=application/x-www-form-urlencoded"`
}

type PostOauth2RevokeResponse struct {
	ContentType string
	OAuth2Error *shared.OAuth2Error
	StatusCode  int64
}
