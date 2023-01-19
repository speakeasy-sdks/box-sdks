package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutUsersIDPathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type PutUsersIDQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

// PutUsersIDRequestBodyNotificationEmail
// An alternate notification email address to which email
// notifications are sent. When it's confirmed, this will be
// the email address to which notifications are sent instead of
// to the primary email address.
//
// Set this value to `null` to remove the notification email.
type PutUsersIDRequestBodyNotificationEmail struct {
	Email *string `json:"email,omitempty"`
}

type PutUsersIDRequestBodyRoleEnum string

const (
	PutUsersIDRequestBodyRoleEnumCoadmin PutUsersIDRequestBodyRoleEnum = "coadmin"
	PutUsersIDRequestBodyRoleEnumUser    PutUsersIDRequestBodyRoleEnum = "user"
)

type PutUsersIDRequestBodyStatusEnum string

const (
	PutUsersIDRequestBodyStatusEnumActive                 PutUsersIDRequestBodyStatusEnum = "active"
	PutUsersIDRequestBodyStatusEnumInactive               PutUsersIDRequestBodyStatusEnum = "inactive"
	PutUsersIDRequestBodyStatusEnumCannotDeleteEdit       PutUsersIDRequestBodyStatusEnum = "cannot_delete_edit"
	PutUsersIDRequestBodyStatusEnumCannotDeleteEditUpload PutUsersIDRequestBodyStatusEnum = "cannot_delete_edit_upload"
)

type PutUsersIDRequestBody struct {
	Address                       *string                                 `json:"address,omitempty"`
	CanSeeManagedUsers            *bool                                   `json:"can_see_managed_users,omitempty"`
	Enterprise                    *string                                 `json:"enterprise,omitempty"`
	ExternalAppUserID             *string                                 `json:"external_app_user_id,omitempty"`
	IsExemptFromDeviceLimits      *bool                                   `json:"is_exempt_from_device_limits,omitempty"`
	IsExemptFromLoginVerification *bool                                   `json:"is_exempt_from_login_verification,omitempty"`
	IsExternalCollabRestricted    *bool                                   `json:"is_external_collab_restricted,omitempty"`
	IsPasswordResetRequired       *bool                                   `json:"is_password_reset_required,omitempty"`
	IsSyncEnabled                 *bool                                   `json:"is_sync_enabled,omitempty"`
	JobTitle                      *string                                 `json:"job_title,omitempty"`
	Language                      *string                                 `json:"language,omitempty"`
	Login                         *string                                 `json:"login,omitempty"`
	Name                          *string                                 `json:"name,omitempty"`
	NotificationEmail             *PutUsersIDRequestBodyNotificationEmail `json:"notification_email,omitempty"`
	Notify                        *bool                                   `json:"notify,omitempty"`
	Phone                         *string                                 `json:"phone,omitempty"`
	Role                          *PutUsersIDRequestBodyRoleEnum          `json:"role,omitempty"`
	SpaceAmount                   *int64                                  `json:"space_amount,omitempty"`
	Status                        *PutUsersIDRequestBodyStatusEnum        `json:"status,omitempty"`
	Timezone                      *string                                 `json:"timezone,omitempty"`
	TrackingCodes                 []shared.TrackingCode                   `json:"tracking_codes,omitempty"`
}

type PutUsersIDRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutUsersIDPathParams
	QueryParams PutUsersIDQueryParams
	Request     *PutUsersIDRequestBody `request:"mediaType=application/json"`
}

type PutUsersIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
	User        *shared.User
}
