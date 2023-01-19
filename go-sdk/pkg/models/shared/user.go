package shared

import (
	"time"
)

// UserNotificationEmail
// An alternate notification email address to which email
// notifications are sent. When it's confirmed, this will be
// the email address to which notifications are sent instead of
// to the primary email address.
type UserNotificationEmail struct {
	Email       *string `json:"email,omitempty"`
	IsConfirmed *bool   `json:"is_confirmed,omitempty"`
}

type UserStatusEnum string

const (
	UserStatusEnumActive                 UserStatusEnum = "active"
	UserStatusEnumInactive               UserStatusEnum = "inactive"
	UserStatusEnumCannotDeleteEdit       UserStatusEnum = "cannot_delete_edit"
	UserStatusEnumCannotDeleteEditUpload UserStatusEnum = "cannot_delete_edit_upload"
)

type UserTypeEnum string

const (
	UserTypeEnumUser UserTypeEnum = "user"
)

// User
// A mini representation of a user, used when
// nested within another resource.
type User struct {
	Address           *string                `json:"address,omitempty"`
	AvatarURL         *string                `json:"avatar_url,omitempty"`
	CreatedAt         *time.Time             `json:"created_at,omitempty"`
	ID                *string                `json:"id,omitempty"`
	JobTitle          *string                `json:"job_title,omitempty"`
	Language          *string                `json:"language,omitempty"`
	Login             string                 `json:"login"`
	MaxUploadSize     *int64                 `json:"max_upload_size,omitempty"`
	ModifiedAt        *time.Time             `json:"modified_at,omitempty"`
	Name              string                 `json:"name"`
	NotificationEmail *UserNotificationEmail `json:"notification_email,omitempty"`
	Phone             *string                `json:"phone,omitempty"`
	SpaceAmount       *int64                 `json:"space_amount,omitempty"`
	SpaceUsed         *int64                 `json:"space_used,omitempty"`
	Status            *UserStatusEnum        `json:"status,omitempty"`
	Timezone          *string                `json:"timezone,omitempty"`
	Type              UserTypeEnum           `json:"type"`
}
