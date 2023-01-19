package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteUsersIDEmailAliasesIDPathParams struct {
	EmailAliasID string `pathParam:"style=simple,explode=false,name=email_alias_id"`
	UserID       string `pathParam:"style=simple,explode=false,name=user_id"`
}

type DeleteUsersIDEmailAliasesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteUsersIDEmailAliasesIDPathParams
}

type DeleteUsersIDEmailAliasesIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
