package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteUsersIDPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type DeleteUsersIDQueryParams struct {
	Force  *bool `queryParam:"style=form,explode=true,name=force"`
	Notify *bool `queryParam:"style=form,explode=true,name=notify"`
}

type DeleteUsersIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  DeleteUsersIDPathParams
	QueryParams DeleteUsersIDQueryParams
}

type DeleteUsersIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
