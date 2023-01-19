package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetUsersIDEmailAliasesPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type GetUsersIDEmailAliasesRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetUsersIDEmailAliasesPathParams
}

type GetUsersIDEmailAliasesResponse struct {
	ClientError  *shared.ClientError
	ContentType  string
	EmailAliases *shared.EmailAliases
	StatusCode   int64
}
