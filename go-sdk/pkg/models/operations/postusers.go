package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostUsersQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PostUsersRequestBodyRoleEnum string

const (
	PostUsersRequestBodyRoleEnumCoadmin PostUsersRequestBodyRoleEnum = "coadmin"
	PostUsersRequestBodyRoleEnumUser    PostUsersRequestBodyRoleEnum = "user"
)

type PostUsersRequestBodyStatusEnum string

const (
	PostUsersRequestBodyStatusEnumActive                 PostUsersRequestBodyStatusEnum = "active"
	PostUsersRequestBodyStatusEnumInactive               PostUsersRequestBodyStatusEnum = "inactive"
	PostUsersRequestBodyStatusEnumCannotDeleteEdit       PostUsersRequestBodyStatusEnum = "cannot_delete_edit"
	PostUsersRequestBodyStatusEnumCannotDeleteEditUpload PostUsersRequestBodyStatusEnum = "cannot_delete_edit_upload"
)

type PostUsersRequestBody struct {
	Address                       *string                         `json:"address,omitempty"`
	CanSeeManagedUsers            *bool                           `json:"can_see_managed_users,omitempty"`
	ExternalAppUserID             *string                         `json:"external_app_user_id,omitempty"`
	IsExemptFromDeviceLimits      *bool                           `json:"is_exempt_from_device_limits,omitempty"`
	IsExemptFromLoginVerification *bool                           `json:"is_exempt_from_login_verification,omitempty"`
	IsExternalCollabRestricted    *bool                           `json:"is_external_collab_restricted,omitempty"`
	IsPlatformAccessOnly          *bool                           `json:"is_platform_access_only,omitempty"`
	IsSyncEnabled                 *bool                           `json:"is_sync_enabled,omitempty"`
	JobTitle                      *string                         `json:"job_title,omitempty"`
	Language                      *string                         `json:"language,omitempty"`
	Login                         *string                         `json:"login,omitempty"`
	Name                          string                          `json:"name"`
	Phone                         *string                         `json:"phone,omitempty"`
	Role                          *PostUsersRequestBodyRoleEnum   `json:"role,omitempty"`
	SpaceAmount                   *int64                          `json:"space_amount,omitempty"`
	Status                        *PostUsersRequestBodyStatusEnum `json:"status,omitempty"`
	Timezone                      *string                         `json:"timezone,omitempty"`
	TrackingCodes                 []shared.TrackingCode           `json:"tracking_codes,omitempty"`
}

type PostUsersRequest struct {
	Retries     *utils.RetryConfig
	QueryParams PostUsersQueryParams
	Request     *PostUsersRequestBody `request:"mediaType=application/json"`
}

type PostUsersResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	User        *shared.User
}
