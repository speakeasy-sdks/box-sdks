package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetUsersUserTypeEnum string

const (
	GetUsersUserTypeEnumAll      GetUsersUserTypeEnum = "all"
	GetUsersUserTypeEnumManaged  GetUsersUserTypeEnum = "managed"
	GetUsersUserTypeEnumExternal GetUsersUserTypeEnum = "external"
)

type GetUsersQueryParams struct {
	ExternalAppUserID *string               `queryParam:"style=form,explode=true,name=external_app_user_id"`
	Fields            []string              `queryParam:"style=form,explode=false,name=fields"`
	FilterTerm        *string               `queryParam:"style=form,explode=true,name=filter_term"`
	Limit             *int64                `queryParam:"style=form,explode=true,name=limit"`
	Marker            *string               `queryParam:"style=form,explode=true,name=marker"`
	Offset            *int64                `queryParam:"style=form,explode=true,name=offset"`
	Usemarker         *bool                 `queryParam:"style=form,explode=true,name=usemarker"`
	UserType          *GetUsersUserTypeEnum `queryParam:"style=form,explode=true,name=user_type"`
}

type GetUsersRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetUsersQueryParams
}

type GetUsersResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	Users       *shared.Users
}
