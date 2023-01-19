package operations

import (
	"openapi/pkg/utils"
)

var GetAuthorizeServerList = []string{
	"https://account.box.com/api/oauth2",
}

type GetAuthorizeResponseTypeEnum string

const (
	GetAuthorizeResponseTypeEnumCode GetAuthorizeResponseTypeEnum = "code"
)

type GetAuthorizeQueryParams struct {
	ClientID     string                       `queryParam:"style=form,explode=true,name=client_id"`
	RedirectURI  *string                      `queryParam:"style=form,explode=true,name=redirect_uri"`
	ResponseType GetAuthorizeResponseTypeEnum `queryParam:"style=form,explode=true,name=response_type"`
	Scope        *string                      `queryParam:"style=form,explode=true,name=scope"`
	State        *string                      `queryParam:"style=form,explode=true,name=state"`
}

type GetAuthorizeRequest struct {
	Retries     *utils.RetryConfig
	ServerURL   *string
	QueryParams GetAuthorizeQueryParams
}

type GetAuthorizeResponse struct {
	ContentType                           string
	StatusCode                            int64
	GetAuthorize200TextHTMLHTMLString     *string
	GetAuthorizeDefaultTextHTMLHTMLString *string
}
