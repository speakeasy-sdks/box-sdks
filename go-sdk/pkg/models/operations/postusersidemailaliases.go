package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostUsersIDEmailAliasesPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type PostUsersIDEmailAliasesRequestBody struct {
	Email string `json:"email"`
}

type PostUsersIDEmailAliasesRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostUsersIDEmailAliasesPathParams
	Request    *PostUsersIDEmailAliasesRequestBody `request:"mediaType=application/json"`
}

type PostUsersIDEmailAliasesResponse struct {
	ClientError *shared.ClientError
	ContentType string
	EmailAlias  *shared.EmailAlias
	StatusCode  int64
}
